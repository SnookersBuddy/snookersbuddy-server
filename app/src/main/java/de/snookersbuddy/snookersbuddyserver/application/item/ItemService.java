package de.snookersbuddy.snookersbuddyserver.application.item;

import de.snookersbuddy.snookersbuddyserver.application.configuration.option.OptionDTO;
import de.snookersbuddy.snookersbuddyserver.application.configuration.variant.VariantDTO;
import de.snookersbuddy.snookersbuddyserver.application.configuration.variant.VariantWithDefaultDTO;
import de.snookersbuddy.snookersbuddyserver.domain.model.item.ItemRepository;
import de.snookersbuddy.snookersbuddyserver.domain.model.option.Option;
import de.snookersbuddy.snookersbuddyserver.domain.model.option.OptionRepository;
import de.snookersbuddy.snookersbuddyserver.domain.model.variant.Variant;
import de.snookersbuddy.snookersbuddyserver.domain.model.variant.VariantRepository;
import de.snookersbuddy.snookersbuddyserver.ports.rest.item.CreateItemsOutput;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    private final VariantRepository variantRepository;

    private final OptionRepository optionRepository;

    public ItemService(final ItemRepository itemRepository, VariantRepository variantRepository, OptionRepository optionRepository) {

        this.itemRepository = itemRepository;
        this.variantRepository = variantRepository;
        this.optionRepository = optionRepository;
    }

    public Set<ItemDTO> getAllItems() {
        final var items = ItemMapper.mapDataObjectsOnTransferObjects(itemRepository.findAll());
        return Set.copyOf(items);
    }

    public CreateItemsOutput getAllConfigurationsForItems() {
        var availableOptions = optionRepository.findAll();
        var availableVariants = variantRepository.findAll();

        var variantWithDefaultDto = createAvailableVariants(availableVariants);
        var options = createAvailableOptions(availableOptions);

        return new CreateItemsOutput(options, variantWithDefaultDto);
    }

    private Set<OptionDTO> createAvailableOptions(List<Option> availableOptions) {

        Set<OptionDTO> optionDTOS = new HashSet<>();
        availableOptions.forEach(a -> {
            optionDTOS.add(new OptionDTO(a.getId(),a.getName(),true));
        });
        return optionDTOS;
    }

    private Set<VariantWithDefaultDTO> createAvailableVariants(List<Variant> availableVariants) {
        Set<Variant> variantsOrderedByGroupingId = availableVariants.stream().sorted(Comparator.comparing(Variant::getGroup, (s1, s2) ->
                s2.getId().compareTo(s1.getId()))).collect(Collectors.toCollection(LinkedHashSet::new));

        long groupId = 0;
        String groupName = "";
        Set<VariantWithDefaultDTO> variantWithDefaultDTOs = new HashSet<>();
        Set<VariantDTO> variants = new HashSet<>();

        for (var variant : variantsOrderedByGroupingId) {

            if (groupId != variant.getGroup().getId()) {


                groupId = variant.getGroup().getId();
                var test = new VariantDTO(variant.getId(), variant.getName());
                variants = new HashSet(Collections.singleton(test));
                groupName = variant.getGroup().getName();

                var variantWithDefaultDto = new VariantWithDefaultDTO(groupName, 0, variants);
                variantWithDefaultDTOs.add(variantWithDefaultDto);

            } else {
                variants.add(new VariantDTO(variant.getId(), variant.getName()));
            }


        }
        return variantWithDefaultDTOs;
    }
}


