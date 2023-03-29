package de.snookersbuddy.snookersbuddyserver.ports.rest.option;

import de.snookersbuddy.snookersbuddyserver.application.configuration.option.OptionDTO;

public record GetOptionOutput(long id, String name) {
    public static GetOptionOutput fromEntity(OptionDTO option) {
        return new GetOptionOutput(option.id(), option.name());
    }
}
