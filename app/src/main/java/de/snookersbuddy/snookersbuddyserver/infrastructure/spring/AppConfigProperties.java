package de.snookersbuddy.snookersbuddyserver.infrastructure.spring;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "appconfig")
@Data
public class AppConfigProperties {
    private boolean debug;
}
