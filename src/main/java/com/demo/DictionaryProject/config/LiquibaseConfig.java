package com.demo.DictionaryProject.config;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@EnableConfigurationProperties(LiquibaseConfigProperties.class)
public class LiquibaseConfig {

    private final LiquibaseConfigProperties liquibaseConfigProperties;

    @Autowired
    public LiquibaseConfig(LiquibaseConfigProperties liquibaseConfigProperties) {
        this.liquibaseConfigProperties = liquibaseConfigProperties;
    }

    @Bean
    public SpringLiquibase liquibase(DataSource dataSource) {
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setDataSource(dataSource);
        liquibase.setChangeLog(liquibaseConfigProperties.getChangeLog());

        return liquibase;
    }
}
