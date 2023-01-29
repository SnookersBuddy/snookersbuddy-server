package de.snookersbuddy.snookersbuddyserver.application.configuration.option;

import de.snookersbuddy.snookersbuddyserver.domain.model.option.Option;

public record OptionDTO(long id, String name) {

    public static OptionDTO fromEntity(Option option) {
        return new OptionDTO(option.getId(), option.getName());
    }
}
