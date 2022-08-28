package de.snookersbuddy.snookersbuddyserver.application.configuration;

import de.snookersbuddy.snookersbuddyserver.application.configuration.option.OptionDTO;
import de.snookersbuddy.snookersbuddyserver.application.configuration.option.OptionMapper;
import de.snookersbuddy.snookersbuddyserver.application.configuration.variant.VariantMapper;
import de.snookersbuddy.snookersbuddyserver.application.configuration.variant.VariantWithDefaultDTO;
import de.snookersbuddy.snookersbuddyserver.application.item.ItemMapper;
import de.snookersbuddy.snookersbuddyserver.domain.model.item.*;
import de.snookersbuddy.snookersbuddyserver.ports.rest.configuration.GetConfigurationOutput;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

@Service
public class ItemConfigurationService {

    private final ItemOptionRepository itemOptionRepository;

    private final ItemVariantRepository itemVariantRepository;

    private final ItemRepository itemRepository;

    public ItemConfigurationService(
            final ItemOptionRepository itemOptionRepository,
            final ItemVariantRepository itemVariantRepository,
            ItemRepository itemRepository
    ) {
        this.itemOptionRepository = itemOptionRepository;
        this.itemVariantRepository = itemVariantRepository;
        this.itemRepository = itemRepository;
    }

    public GetConfigurationOutput getItemConfigurationById(long itemId) {
        final var allowedOptions = itemOptionRepository.findByItem_Id(itemId);
        final var allowedVariants = itemVariantRepository.findByItem_Id(itemId);

        final var selectedItem = itemRepository.getReferenceById(itemId);

        return new GetConfigurationOutput(
                ItemMapper.mapDataObjectOnTransferObject(selectedItem),
                buildVariants(allowedVariants),
                buildOptions(allowedOptions)
        );
    }

    private Set<OptionDTO> buildOptions(Set<ItemOption> itemOptions) {
        return itemOptions.stream().map(OptionMapper::mapDataObjectOnTransferObject).collect(Collectors.toSet());
    }

    private Set<VariantWithDefaultDTO> buildVariants(Set<ItemVariant> itemVariants) {
        return itemVariants.stream()
                // First group the item variants by their group name.
                .collect(groupingBy(itemVariant -> itemVariant.getVariant().getGroup().getName()))
                // Convert map to set of entries.
                .entrySet()
                .stream()
                // Convert map entry to final dto.
                .map(entry -> {
                    // Get the id of the default select variant, throw otherwise if nothing found.
                    final var defaultValueId = entry.getValue()
                            .stream()
                            .filter(ItemVariant::isDefaultEnabled)
                            .findAny()
                            .map(iv -> iv.getVariant().getId())
                            .orElseThrow();

                    // Construct and return final dto.
                    return new VariantWithDefaultDTO(
                            entry.getKey(),
                            defaultValueId,
                            VariantMapper.mapVariantsToDTO(entry.getValue()
                                    .stream()
                                    .map(ItemVariant::getVariant)
                                    .collect(Collectors.toSet()))
                    );
                })
                .collect(Collectors.toSet());
    }
}
