package de.snookersbuddy.snookersbuddyserver.ports.rest.item;

import de.snookersbuddy.snookersbuddyserver.application.configuration.option.OptionWithDefaultDTO;
import de.snookersbuddy.snookersbuddyserver.application.configuration.variant.VariantWithDefaultDTO;
import de.snookersbuddy.snookersbuddyserver.application.item.ItemCategoryDTO;

import java.io.Serializable;
import java.util.Set;

public record CreateItemsOutput(
        long itemId,
        String itemName,
        String abbreviation,
        int categoryId,
        Set<OptionWithDefaultDTO> availableOptions,
        Set<VariantWithDefaultDTO> availableVariants,
        Set<ItemCategoryDTO> availableCategories) implements Serializable {
}
