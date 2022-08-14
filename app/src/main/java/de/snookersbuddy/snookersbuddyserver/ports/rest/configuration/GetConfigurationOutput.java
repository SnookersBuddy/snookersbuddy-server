package de.snookersbuddy.snookersbuddyserver.ports.rest.configuration;

import de.snookersbuddy.snookersbuddyserver.application.item.ItemDTO;
import de.snookersbuddy.snookersbuddyserver.application.configuration.option.OptionDTO;
import de.snookersbuddy.snookersbuddyserver.application.configuration.variant.VariantDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GetConfigurationOutput {

    private ItemDTO item;
    private List<VariantDTO> variants;
    private List<OptionDTO> options;
}
