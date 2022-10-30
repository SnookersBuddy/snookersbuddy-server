package de.snookersbuddy.snookersbuddyserver.application.configuration.variant;

import de.snookersbuddy.snookersbuddyserver.domain.model.variant.Variant;

import java.util.Set;
import java.util.stream.Collectors;

public class VariantMapper {

    public static Set<VariantDTO> mapVariantsToDTO(final Set<Variant> variants) {
        return variants.stream().map(VariantMapper::mapVariantToDTO).collect(Collectors.toSet());
    }

    public static VariantDTO mapVariantToDTO(final Variant variant) {
        return new VariantDTO(variant.getId(), variant.getName());
    }
}
