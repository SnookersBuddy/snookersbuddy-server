package de.snookersbuddy.snookersbuddyserver.application.variant;

import de.snookersbuddy.snookersbuddyserver.application.configuration.variant.SingleVariantDTO;
import de.snookersbuddy.snookersbuddyserver.application.configuration.variant.VariantDTO;
import de.snookersbuddy.snookersbuddyserver.domain.model.item.ItemVariantRepository;
import de.snookersbuddy.snookersbuddyserver.domain.model.variant.Variant;
import de.snookersbuddy.snookersbuddyserver.domain.model.variant.VariantGroup;
import de.snookersbuddy.snookersbuddyserver.domain.model.variant.VariantGroupRepository;
import de.snookersbuddy.snookersbuddyserver.domain.model.variant.VariantRepository;
import de.snookersbuddy.snookersbuddyserver.ports.rest.variant.GetVariantOutput;
import de.snookersbuddy.snookersbuddyserver.ports.rest.variant.VariantInput;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class VariantService {

    private final VariantRepository variantRepository;

    private final VariantGroupRepository variantGroupRepository;

    private final ItemVariantRepository itemVariantRepository;

    public VariantService(final VariantRepository variantRepository,
                          final VariantGroupRepository variantGroupRepository,
                          final ItemVariantRepository itemVariantRepository) {

        this.variantRepository = variantRepository;
        this.variantGroupRepository = variantGroupRepository;
        this.itemVariantRepository = itemVariantRepository;
    }

    /**
     * For saving a new Variant you have to save the new VariantGroup first (such as "Größe")
     * and finally all singleVariants (such as "0,4" - "0,5")
     *
     * @param variantInput
     */
    public void saveVariant(final VariantInput variantInput) {

        var variantGroup = mapVariantInputOnVariantGroup(variantInput.variantGroup());
        var savedVariantGroup = variantGroupRepository.saveAndFlush(variantGroup);

        Set<Variant> variants = new HashSet<>();
        for (var singleVariantDto : variantInput.singleVariants()) {
            var singleVariant = mapVariantInputOnSinlgeVariant(singleVariantDto, savedVariantGroup);
            variants.add(singleVariant);
        }
        variantRepository.saveAll(variants);
    }

    /**
     * For updating an existing Variant the VariantGroup has to be updated first and
     * finally new singleVariants has to be added, edited has to be updated and deleted has to be removed.
     */
    @Transactional
    public void updateVariant(long variantId, VariantInput variantToUpdate) {
        var variantGroup = variantGroupRepository.findById(variantToUpdate.variantGroup().id())
                .orElseThrow(() -> new IllegalArgumentException(String.format("Could not find variantGroup with id %s",
                        variantToUpdate.variantGroup().id())));
        variantGroup.setName(variantToUpdate.variantGroup().name());
        variantGroupRepository.save(variantGroup);

        Set<Variant> singleVariants = new HashSet<>();

        // TODO: Map to ids before fetching to group select.
        for (var singleVariant : variantToUpdate.singleVariants()) {
            // Determine whether it is a new or an updated singleVariant.
            final var variant = Optional.ofNullable(singleVariant.id())
                    .flatMap(variantRepository::findById)
                    .orElseGet(() -> createNewSingleVariant(variantId, singleVariant));

            variant.setName(singleVariant.name());
            singleVariants.add(variant);
        }

        final var savedIds = variantRepository
                .saveAll(singleVariants)
                .stream()
                .map(Variant::getId)
                .collect(Collectors.toSet());

        variantRepository.deleteOrphanedVariants(variantGroup.getId(), savedIds);
    }

    private Variant createNewSingleVariant(long variantId, SingleVariantDTO singleVariant) {
        var variant = new Variant();
        variant.setName(singleVariant.name());
        variant.setGroup(new VariantGroup(variantId));
        return variant;
    }

    private VariantGroup mapVariantInputOnVariantGroup(VariantGroupDTO variantInput) {
        var variantGroup = new VariantGroup();
        variantGroup.setName(variantInput.name());
        return variantGroup;
    }

    private Variant mapVariantInputOnSinlgeVariant(SingleVariantDTO singleVariantDto, VariantGroup savedVariantGroup) {
        var singleVariant = new Variant();
        singleVariant.setGroup(savedVariantGroup);
        singleVariant.setName(singleVariantDto.name());
        return singleVariant;
    }

    public void deleteVariant(long variantGroupId) {

        variantGroupRepository.deleteById(variantGroupId);
    }

    public GetVariantOutput getVariantByGroupId(long groupId) {
        var variantGroup = variantGroupRepository.getReferenceById(groupId);
        var variantGroupDTO = VariantGroupDTO.fromEntity(variantGroup.getId(), variantGroup.getName());
        var variants = variantRepository.getVariantsByGroupId(variantGroup.getId());
        var variantDTOs = SingleVariantDTO.fromEntitySet(variants);
        var variantDTO = VariantDTO.fromEntity(variantGroupDTO, variantDTOs);
        return GetVariantOutput.fromEntity(variantDTO);

    }
}
