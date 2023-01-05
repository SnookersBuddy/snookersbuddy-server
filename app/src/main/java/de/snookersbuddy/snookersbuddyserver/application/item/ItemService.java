package de.snookersbuddy.snookersbuddyserver.application.item;

import de.snookersbuddy.snookersbuddyserver.application.configuration.option.OptionDTO;
import de.snookersbuddy.snookersbuddyserver.application.configuration.variant.VariantDTO;
import de.snookersbuddy.snookersbuddyserver.application.configuration.variant.VariantWithDefaultDTO;
import de.snookersbuddy.snookersbuddyserver.domain.model.item.*;
import de.snookersbuddy.snookersbuddyserver.domain.model.option.Option;
import de.snookersbuddy.snookersbuddyserver.domain.model.option.OptionRepository;
import de.snookersbuddy.snookersbuddyserver.domain.model.variant.Variant;
import de.snookersbuddy.snookersbuddyserver.domain.model.variant.VariantRepository;
import de.snookersbuddy.snookersbuddyserver.ports.rest.item.CreateItemsInput;
import de.snookersbuddy.snookersbuddyserver.ports.rest.item.CreateItemsOutput;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    private final VariantRepository variantRepository;

    private final OptionRepository optionRepository;

    private final ItemVariantRepository itemVariantRepository;

    private final ItemOptionRepository itemOptionRepository;

    public ItemService(final ItemRepository itemRepository, VariantRepository variantRepository, OptionRepository optionRepository, ItemVariantRepository itemVariantRepository, ItemOptionRepository itemOptionRepository) {

        this.itemRepository = itemRepository;
        this.variantRepository = variantRepository;
        this.optionRepository = optionRepository;
        this.itemVariantRepository = itemVariantRepository;
        this.itemOptionRepository = itemOptionRepository;
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
            optionDTOS.add(new OptionDTO(a.getId(), a.getName(), true));
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

    public CreateItemsInput createItem(CreateItemsInput createItemsInput) {
        try {
            var item = new Item();
            item.setName(createItemsInput.itemName());
            item.setDescription(null);
            item.setCategory(0);
            item.setSpecialFeature(null);

            item = itemRepository.saveAndFlush(item);

            for (var option : createItemsInput.selectedOptions()) {
                var itemOption = new ItemOption();
                itemOption.setItem(item);
                itemOption.setOption(new Option(option.id()));
                itemOption.setDefaultEnabled(option.defaultValue());
                itemOptionRepository.save(itemOption);
            }

            for (var variant : createItemsInput.selectedVariants()) {
                for (var test : variant.variants()) {
                    var itemVariant = new ItemVariant();
                    itemVariant.setItem(item);
                    itemVariant.setVariant(new Variant(test.id()));
                    itemVariant.setDefaultEnabled(itemVariant.getVariant().getId() == variant.defaultVariantId());
                    itemVariantRepository.save(itemVariant);
                }

            }

        } catch (DataIntegrityViolationException d) {
            d.printStackTrace();
            return null;
        }
        return null;
    }
}


