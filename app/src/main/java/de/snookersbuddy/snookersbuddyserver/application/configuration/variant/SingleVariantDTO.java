package de.snookersbuddy.snookersbuddyserver.application.configuration.variant;

import de.snookersbuddy.snookersbuddyserver.domain.model.order.ChosenVariant;
import de.snookersbuddy.snookersbuddyserver.domain.model.variant.Variant;
import org.springframework.lang.Nullable;

import java.util.HashSet;
import java.util.Set;

public record SingleVariantDTO(@Nullable Long id, String name, boolean selected) {
    public static SingleVariantDTO fromEntity(ChosenVariant variant) {
        return new SingleVariantDTO(variant.originalId(), variant.name(), variant.selected());
    }

    public ChosenVariant toEntity() {
        return new ChosenVariant(id, name, selected);
    }

    public static Set<SingleVariantDTO> fromEntitySet(Set<Variant> variants) {
        Set<SingleVariantDTO> variantDTOS = new HashSet<>();
        variants.forEach(variant ->
                variantDTOS.add(SingleVariantDTO.fromEntity(ChosenVariant.fromEntity(variant))));
        return variantDTOS;
    }
}
