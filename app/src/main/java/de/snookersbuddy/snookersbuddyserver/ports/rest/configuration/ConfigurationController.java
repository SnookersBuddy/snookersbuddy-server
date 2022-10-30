package de.snookersbuddy.snookersbuddyserver.ports.rest.configuration;

import de.snookersbuddy.snookersbuddyserver.application.configuration.ItemConfigurationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationController {

    private final ItemConfigurationService configurationService;

    public ConfigurationController(ItemConfigurationService configurationService) {
        this.configurationService = configurationService;
    }

    @GetMapping("/api/item/{itemId}/configuration")
    public GetConfigurationOutput getConfigurationByItemId(@PathVariable("itemId") int itemId) {

        return configurationService.getItemConfigurationById(itemId);
    }
}
