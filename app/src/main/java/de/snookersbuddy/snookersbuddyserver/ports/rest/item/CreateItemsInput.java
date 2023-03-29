package de.snookersbuddy.snookersbuddyserver.ports.rest.item;

import de.snookersbuddy.snookersbuddyserver.application.configuration.option.OptionWithDefaultDTO;
import de.snookersbuddy.snookersbuddyserver.application.configuration.variant.VariantWithDefaultDTO;
import de.snookersbuddy.snookersbuddyserver.application.item.ItemCategoryDTO;

import java.util.List;

public record CreateItemsInput(
        String itemName,
        String abbreviation,
        int categoryId,
        int itemId,
        List<OptionWithDefaultDTO> availableOptions,
        List<VariantWithDefaultDTO> availableVariants,
        List<ItemCategoryDTO> availableCategories) {
}
