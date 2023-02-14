package de.snookersbuddy.snookersbuddyserver.ports.rest.variant;

import de.snookersbuddy.snookersbuddyserver.application.configuration.variant.VariantDTO;

public record VariantOutput(VariantDTO variantDTO) {

    public static VariantOutput fromEntity(VariantDTO variantDTO){
        return new VariantOutput(variantDTO);
    }
}
