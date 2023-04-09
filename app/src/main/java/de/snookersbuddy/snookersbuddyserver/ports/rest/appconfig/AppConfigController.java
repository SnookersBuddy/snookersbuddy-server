package de.snookersbuddy.snookersbuddyserver.ports.rest.appconfig;

import de.snookersbuddy.snookersbuddyserver.infrastructure.spring.AppConfigProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppConfigController {
    private final AppConfigProperties appConfigProperties;

    public AppConfigController(AppConfigProperties appConfigProperties) {
        this.appConfigProperties = appConfigProperties;
    }

    @GetMapping("/api/appconfig")
    public GetAppConfigOutput getAppConfig() {
        return new GetAppConfigOutput(appConfigProperties.isDebug());
    }
}
