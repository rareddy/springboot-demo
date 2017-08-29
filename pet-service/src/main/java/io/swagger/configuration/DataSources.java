package io.swagger.configuration;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSources {
    
    @ConfigurationProperties(prefix = "spring.datasource.gwpets")
    @Bean
    public DataSource gwPets() {
        return DataSourceBuilder.create().build();
    }    
}