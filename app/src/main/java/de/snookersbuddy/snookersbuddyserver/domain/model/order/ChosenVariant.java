package de.snookersbuddy.snookersbuddyserver.domain.model.order;

import de.snookersbuddy.snookersbuddyserver.domain.model.variant.Variant;

public record ChosenVariant(long originalId, String name) {

    public static ChosenVariant fromEntity(Variant variant) {
        return new ChosenVariant(variant.getId(), variant.getName());
    }
}
