package de.snookersbuddy.snookersbuddyserver.application.item;

import de.snookersbuddy.snookersbuddyserver.application.configuration.option.OptionWithDefaultDTO;
import de.snookersbuddy.snookersbuddyserver.application.configuration.variant.SingleVariantDTO;
import de.snookersbuddy.snookersbuddyserver.application.configuration.variant.VariantWithDefaultDTO;
import de.snookersbuddy.snookersbuddyserver.application.variant.VariantGroupDTO;
import de.snookersbuddy.snookersbuddyserver.domain.model.assignment.AssignmentRepository;
import de.snookersbuddy.snookersbuddyserver.domain.model.item.*;
import de.snookersbuddy.snookersbuddyserver.domain.model.option.Option;
import de.snookersbuddy.snookersbuddyserver.domain.model.option.OptionRepository;
import de.snookersbuddy.snookersbuddyserver.domain.model.variant.Variant;
import de.snookersbuddy.snookersbuddyserver.domain.model.variant.VariantGroupRepository;
import de.snookersbuddy.snookersbuddyserver.domain.model.variant.VariantRepository;
import de.snookersbuddy.snookersbuddyserver.ports.rest.admin.GetTableDataOutput;
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

    private final VariantGroupRepository variantGroupRepository;

    private final OptionRepository optionRepository;

    private final ItemVariantRepository itemVariantRepository;

    private final ItemOptionRepository itemOptionRepository;

    private final AssignmentRepository assignmentRepository;

    public ItemService(final ItemRepository itemRepository, final VariantRepository variantRepository, final OptionRepository optionRepository,
                       final ItemVariantRepository itemVariantRepository, final ItemOptionRepository itemOptionRepository,
                       final VariantGroupRepository variantGroupRepository, final AssignmentRepository assignmentRepository) {

        this.itemRepository = itemRepository;
        this.variantRepository = variantRepository;
        this.optionRepository = optionRepository;
        this.itemVariantRepository = itemVariantRepository;
        this.itemOptionRepository = itemOptionRepository;
        this.variantGroupRepository = variantGroupRepository;
        this.assignmentRepository = assignmentRepository;
    }

    public Set<ItemDTO> getAllItems() {
        final var items = ItemDTO.fromEntityList(itemRepository.findAll());
        return Set.copyOf(items);
    }

    public CreateItemsOutput getAllConfigurationsForItems(Optional<Long> itemId) {
        final var availableCategories = Arrays.stream(ItemCategories.values()).map(a -> new ItemCategoryDTO(a.getCategoryName(), a.getId())).collect(Collectors.toSet());
        final var availableOptions = optionRepository.findAll();
        final var availableVariants = variantRepository.findAll();

        // new created item
        var itemName = "";
        var abbreviation = "";
        var categoryId = 0;
        var id = 0L;

        Map<String, Map<Long, ItemVariant>> itemVariantsByIdByVariantGroup = new HashMap<>();
        Map<Long, ItemOption> itemOptionsById = new HashMap<>();

        // only if item is already existing - fill data from saved items such as default selection, name etc.
        if (itemId.isPresent()) {

            final var allowedOptions = itemOptionRepository.findByItem_Id(itemId.get());
            final var allowedVariants = itemVariantRepository.findByItem_Id(itemId.get());
            final var selectedItem = itemRepository.getReferenceById(itemId.get());

            itemName = selectedItem.getName();
            abbreviation = selectedItem.getAbbreviation();
            categoryId = selectedItem.getCategory();
            id = itemId.get();

            // needed for determining defaultValues/selections
            allowedVariants.forEach(a -> {
                if (!itemVariantsByIdByVariantGroup.containsKey(a.getVariant().getGroup().getName())) {
                    itemVariantsByIdByVariantGroup.put(a.getVariant().getGroup().getName(), new HashMap<>());
                }
                itemVariantsByIdByVariantGroup.get(a.getVariant().getGroup().getName()).put(a.getId().getVariantId(), a);
            });
            // needed for determining defaultValues/selections
            allowedOptions.forEach(a -> {
                itemOptionsById.put(a.getId().getOptionId(), a);
            });

        }

        var variantWithDefaultDto = createAvailableVariants(availableVariants, itemVariantsByIdByVariantGroup);
        var options = createAvailableOptions(availableOptions, itemOptionsById);

        return new CreateItemsOutput(id, itemName, abbreviation, categoryId, options, variantWithDefaultDto, availableCategories);
    }

    private Set<OptionWithDefaultDTO> createAvailableOptions(List<Option> availableOptions, Map<Long, ItemOption> itemOptionsById) {

        Set<OptionWithDefaultDTO> optionDTOS = new HashSet<>();
        availableOptions.forEach(a -> {
            var selected = itemOptionsById.containsKey(a.getId());
            var defaultValue = itemOptionsById.containsKey(a.getId()) && itemOptionsById.get(a.getId()).isDefaultEnabled();
            optionDTOS.add(new OptionWithDefaultDTO(a.getId(), a.getName(), defaultValue, selected));
        });
        return optionDTOS;
    }

    private Set<VariantWithDefaultDTO> createAvailableVariants(List<Variant> availableVariants, Map<String, Map<Long, ItemVariant>> itemVariantsByIdByVariantGroup) {

        Set<Variant> variantsOrderedByGroupingId = availableVariants.stream().sorted(Comparator.comparing(Variant::getGroup, (s1, s2)
                -> s2.getId().compareTo(s1.getId()))).collect(Collectors.toCollection(LinkedHashSet::new));

        long groupId = 0;
        Set<VariantWithDefaultDTO> variantWithDefaultDTOs = new HashSet<>();
        Set<SingleVariantDTO> variants = new HashSet<>();

        for (var variant : variantsOrderedByGroupingId) {

            // if at least one variant is selected, a default is guaranteed
            var defaultVariantId = 0L;
            if (itemVariantsByIdByVariantGroup.containsKey(variant.getGroup().getName())) {
                defaultVariantId = itemVariantsByIdByVariantGroup.get(variant.getGroup().getName()).values().stream().filter(ItemVariant::isDefaultEnabled).findFirst().get().getId().getVariantId();
            }

            var selected = determineSelectionOfVariant(itemVariantsByIdByVariantGroup, variant);

            // creates a new VariantDTO if the grouping changes (e.g. "Größe" to "Longdrink")
            if (groupId != variant.getGroup().getId()) {

                groupId = variant.getGroup().getId();
                var variantWithSingleVariants = new SingleVariantDTO(variant.getId(), variant.getName(), selected);
                variants = new HashSet(Collections.singleton(variantWithSingleVariants));
                String groupName = variant.getGroup().getName();

                var variantWithDefaultDto = new VariantWithDefaultDTO(groupName, defaultVariantId, variants);
                variantWithDefaultDTOs.add(variantWithDefaultDto);

            } else {
                // add singleVariants to the VariantDTO (e.g. "0,4" to DTO "Größe")
                variants.add(new SingleVariantDTO(variant.getId(), variant.getName(), selected));
            }


        }
        return variantWithDefaultDTOs;
    }

    private boolean determineSelectionOfVariant(Map<String, Map<Long, ItemVariant>> test, Variant variant) {
        if (test.containsKey(variant.getGroup().getName())) {
            return test.get(variant.getGroup().getName()).containsKey(variant.getId());
        }
        return false;
    }

    public boolean createItem(CreateItemsInput createItemsInput) {

        try {
            var item = new Item();
            item.setName(createItemsInput.itemName());
            item.setAbbreviation(createItemsInput.abbreviation());
            item.setDescription(null);
            item.setCategory(createItemsInput.categoryId());
            item.setSpecialFeature(null);

            item = itemRepository.saveAndFlush(item);

            // save optionReferences for new Item
            for (var option : createItemsInput.availableOptions()) {
                var itemOption = new ItemOption();
                itemOption.setItem(item);
                itemOption.setOption(new Option(option.id()));
                itemOption.setDefaultEnabled(option.defaultValue());
                itemOptionRepository.save(itemOption);
            }

            // save variantReferences for new Item
            for (var variant : createItemsInput.availableVariants()) {
                for (var singleVariant : variant.variants()) {
                    var itemVariant = new ItemVariant();
                    itemVariant.setItem(item);
                    itemVariant.setVariant(new Variant(singleVariant.id()));
                    itemVariant.setDefaultEnabled(itemVariant.getVariant().getId() == variant.defaultVariantId());
                    itemVariantRepository.save(itemVariant);
                }

            }

        } catch (DataIntegrityViolationException d) {
            d.printStackTrace();
            return false;
        }
        return true;
    }

    public GetTableDataOutput getTableData() {
        final var assignments = assignmentRepository.findAll();
        final var options = optionRepository.findAll();
        final var variantGroups = variantGroupRepository.findAll().stream().map(a
                -> VariantGroupDTO.fromEntity(a.getId(), a.getName())).collect(Collectors.toSet());
        List<ItemDTO> items = new ArrayList<>();
        itemRepository.findAll().forEach(item -> {
            items.add(ItemDTO.fromEntity(item));
        });

        return new GetTableDataOutput(items, options, variantGroups, assignments);
    }

    public void deleteItem(long itemId) {
        this.itemRepository.deleteById(itemId);
    }

    public void updateItem(long itemId, CreateItemsInput itemToUpdate) {
        final var item = itemRepository.findById(itemId)
                .orElseThrow(() -> new IllegalArgumentException(String.format("Could not find Item with id %s",
                        itemId)));
        item.setAbbreviation(itemToUpdate.abbreviation());
        item.setName(itemToUpdate.itemName());
        item.setCategory(itemToUpdate.categoryId());
        itemRepository.save(item);

        // save and update chosen single variants
        Set<Long> variantIds = new HashSet<>();
        itemToUpdate.availableVariants().forEach(variant -> {
            variant.variants().forEach(singleVariant -> {
                // build diff of deleted or added singleVariants
                var itemVariant = itemVariantRepository.findByItem_IdAndVariant_Id(itemId, singleVariant.id());
                variantIds.add(singleVariant.id());

                if (itemVariant != null) {
                    itemVariant.setDefaultEnabled(singleVariant.id() == variant.defaultVariantId());
                    itemVariantRepository.save(itemVariant);
                } else {
                    itemVariantRepository.save(new ItemVariant(item, new Variant(singleVariant.id()), variant.defaultVariantId() == singleVariant.id()));
                }
            });
        });
        // delete singleVariants which are possible removed from variant
        itemVariantRepository.deleteItemVariantByItemIdWhereVariantIdIsNotIn(itemId, variantIds);

        // save and update chosen options
        Set<Long> optionIds = new HashSet<>();
        itemToUpdate.availableOptions().forEach(option -> {
            var itemOption = itemOptionRepository.findByItem_IdAndOption_Id(itemId, option.id());
            optionIds.add(option.id());
            if (itemOption != null) {
                itemOption.setDefaultEnabled(option.defaultValue());
                itemOptionRepository.save(itemOption);
            } else {
                itemOptionRepository.save(new ItemOption(item, new Option(option.id()), option.defaultValue()));
            }
        });
        // delete options which are possible removed from ItemConfiguration
        itemOptionRepository.deleteItemOptionByItemIdWhereOptionIdIsNotIn(itemId, optionIds);
    }
}


