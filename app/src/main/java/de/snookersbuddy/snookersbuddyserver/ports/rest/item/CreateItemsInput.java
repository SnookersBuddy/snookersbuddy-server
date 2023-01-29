package de.snookersbuddy.snookersbuddyserver.ports.rest.item;

import de.snookersbuddy.snookersbuddyserver.application.configuration.option.OptionWithDefaultDTO;
import de.snookersbuddy.snookersbuddyserver.application.configuration.variant.VariantWithDefaultDTO;

import java.util.List;

public record CreateItemsInput(String itemName, String abbreviation, List<OptionWithDefaultDTO> selectedOptions,
                               List<VariantWithDefaultDTO> selectedVariants, int categoryId) {
}
