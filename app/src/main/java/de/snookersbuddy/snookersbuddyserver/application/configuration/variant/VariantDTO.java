package de.snookersbuddy.snookersbuddyserver.application.configuration.variant;

import de.snookersbuddy.snookersbuddyserver.domain.model.order.ChosenVariant;

public record VariantDTO(long id, String name) {
    public static VariantDTO fromEntity(ChosenVariant variant) {
        return new VariantDTO(variant.originalId(), variant.name());
    }

    public ChosenVariant toEntity() {
        return new ChosenVariant(id, name);
    }
}
