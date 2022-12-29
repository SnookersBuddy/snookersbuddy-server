package de.snookersbuddy.snookersbuddyserver.ports.rest.item;

import de.snookersbuddy.snookersbuddyserver.application.configuration.variant.VariantWithDefaultDTO;
import de.snookersbuddy.snookersbuddyserver.domain.model.option.Option;
import de.snookersbuddy.snookersbuddyserver.domain.model.variant.Variant;

import java.util.List;

public record CreateItemsInput(String itemName, List<Option> selectedOptions, List<VariantWithDefaultDTO> selectedVariants) {
}
