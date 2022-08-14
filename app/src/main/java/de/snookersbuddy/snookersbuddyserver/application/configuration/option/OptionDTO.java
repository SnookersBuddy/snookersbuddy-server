package de.snookersbuddy.snookersbuddyserver.application.configuration.option;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OptionDTO {

    private long id;

    private String name;

    private boolean defaultValue;
}
