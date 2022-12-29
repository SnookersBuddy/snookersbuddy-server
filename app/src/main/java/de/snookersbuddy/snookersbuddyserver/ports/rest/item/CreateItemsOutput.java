package de.snookersbuddy.snookersbuddyserver.ports.rest.item;

import de.snookersbuddy.snookersbuddyserver.application.configuration.option.OptionDTO;
import de.snookersbuddy.snookersbuddyserver.application.configuration.variant.VariantWithDefaultDTO;

import java.io.Serializable;
import java.util.Set;

public record CreateItemsOutput(Set<OptionDTO> availableOptions, Set<VariantWithDefaultDTO> availableVariants) implements Serializable {
}
