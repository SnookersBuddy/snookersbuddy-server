package de.snookersbuddy.snookersbuddyserver.application.configuration.option;

import de.snookersbuddy.snookersbuddyserver.domain.model.order.ChosenOption;

public record OptionDTO(long id, String name, boolean defaultValue) {

    public static OptionDTO fromEntity(ChosenOption option) {
        return new OptionDTO(option.originalId(), option.name(), option.isSelected());
    }

    public ChosenOption toEntity() {
        return new ChosenOption(id, name, defaultValue);
    }
}
