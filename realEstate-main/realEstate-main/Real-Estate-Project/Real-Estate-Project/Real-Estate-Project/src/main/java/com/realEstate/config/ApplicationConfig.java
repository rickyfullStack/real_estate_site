package com.realEstate.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.realEstate.repository")
@EntityScan(basePackages = "com.realEstate.entity")
public class ApplicationConfig {

}