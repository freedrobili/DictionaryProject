package com.demo.DictionaryProject.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "spring.liquibase")
public class LiquibaseConfigProperties {
    private String changeLog;
    private boolean enabled;

    public boolean isEnabled() {
        return enabled;
    }

}
