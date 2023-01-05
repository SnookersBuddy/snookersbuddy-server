package de.snookersbuddy.snookersbuddyserver.ports.rest.item;

import de.snookersbuddy.snookersbuddyserver.application.configuration.option.OptionDTO;
import de.snookersbuddy.snookersbuddyserver.application.configuration.variant.VariantWithDefaultDTO;
import de.snookersbuddy.snookersbuddyserver.domain.model.option.Option;

import java.util.List;

public record CreateItemsInput(String itemName, List<OptionDTO> selectedOptions, List<VariantWithDefaultDTO> selectedVariants) {
}
