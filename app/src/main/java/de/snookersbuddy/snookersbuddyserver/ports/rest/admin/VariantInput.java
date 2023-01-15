package de.snookersbuddy.snookersbuddyserver.ports.rest.admin;

import de.snookersbuddy.snookersbuddyserver.application.configuration.variant.VariantDTO;
import de.snookersbuddy.snookersbuddyserver.application.variant.VariantGroupDTO;

import java.util.Set;

public record VariantInput(VariantGroupDTO variantGroup, Set<VariantDTO> singleVariants) {
}
