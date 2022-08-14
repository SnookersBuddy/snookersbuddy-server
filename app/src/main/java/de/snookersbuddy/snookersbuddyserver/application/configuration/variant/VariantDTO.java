package de.snookersbuddy.snookersbuddyserver.application.configuration.variant;

import de.snookersbuddy.snookersbuddyserver.domain.model.variant.Variant;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class VariantDTO {

    private long id;

    private String name;

    private Variant defaultValue;

    private List<Variant> variants;
}
