package de.snookersbuddy.snookersbuddyserver.application.configuration.variant;

import de.snookersbuddy.snookersbuddyserver.application.variant.VariantGroupDTO;

import java.util.Set;

public record VariantDTO(VariantGroupDTO variantGroup, Set<SingleVariantDTO> singleVariants) {
    public static VariantDTO fromEntity(VariantGroupDTO variantGroup, Set<SingleVariantDTO> singleVariants) {
        return new VariantDTO(variantGroup, singleVariants);
    }

}
