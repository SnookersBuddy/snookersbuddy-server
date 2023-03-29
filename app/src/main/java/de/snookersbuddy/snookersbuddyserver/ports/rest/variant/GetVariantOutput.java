package de.snookersbuddy.snookersbuddyserver.ports.rest.variant;

import de.snookersbuddy.snookersbuddyserver.application.configuration.variant.SingleVariantDTO;
import de.snookersbuddy.snookersbuddyserver.application.configuration.variant.VariantDTO;
import de.snookersbuddy.snookersbuddyserver.application.variant.VariantGroupDTO;

import java.util.Set;

public record GetVariantOutput(VariantGroupDTO variantGroup, Set<SingleVariantDTO> singleVariants) {
    public static GetVariantOutput fromEntity(VariantDTO variantDTO) {
        return new GetVariantOutput(variantDTO.variantGroup(), variantDTO.singleVariants());
    }
}
