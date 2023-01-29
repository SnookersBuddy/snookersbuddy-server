package de.snookersbuddy.snookersbuddyserver.ports.rest.option;

import de.snookersbuddy.snookersbuddyserver.application.configuration.option.OptionDTO;

public record GetOptionOutput(OptionDTO optionDTO) {

    public static GetOptionOutput fromEntity(OptionDTO option) {
        return new GetOptionOutput(option);
    }
}
