package de.snookersbuddy.snookersbuddyserver.ports.rest.variant;

import de.snookersbuddy.snookersbuddyserver.application.configuration.variant.SingleVariantDTO;
import de.snookersbuddy.snookersbuddyserver.application.variant.VariantGroupDTO;

import java.util.Set;

public record VariantInput(VariantGroupDTO variantGroup, Set<SingleVariantDTO> singleVariants) {
}
