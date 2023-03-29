package de.snookersbuddy.snookersbuddyserver.application.configuration.option;

import de.snookersbuddy.snookersbuddyserver.domain.model.item.ItemOption;
import de.snookersbuddy.snookersbuddyserver.domain.model.order.ChosenOption;

public record OptionWithDefaultDTO(long id, String name, boolean defaultValue, boolean selected) {

    public static OptionWithDefaultDTO fromEntity(ChosenOption option) {
        return new OptionWithDefaultDTO(option.originalId(), option.name(), option.isSelected(), option.isSelected());
    }

    public static OptionWithDefaultDTO fromEntity(ItemOption option) {
        return new OptionWithDefaultDTO(option.getOption().getId(), option.getOption().getName(), option.isDefaultEnabled(), false);
    }

    public ChosenOption toEntity() {
        return new ChosenOption(id, name, defaultValue);
    }
}
