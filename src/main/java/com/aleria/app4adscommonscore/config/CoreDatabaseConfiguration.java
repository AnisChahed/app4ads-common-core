/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aleria.app4adscommonscore.config;

import javax.inject.Inject;
import javax.sql.DataSource;
import liquibase.integration.spring.SpringLiquibase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 *
 * @author Anis
 */
@Configuration
public class CoreDatabaseConfiguration implements EnvironmentAware{
    
    private final Logger log = LoggerFactory.getLogger(CoreDatabaseConfiguration.class);

    @Inject
    private Environment environment;
    
    @Override
    public void setEnvironment(Environment e) {
        this.environment = e;
    }
    
    @Bean(name = "liquibase")
    public SpringLiquibase liquibase (DataSource dataSource) {
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setDataSource(dataSource);
        liquibase.setChangeLog("classpath:config/liquibase/master.xml");
        liquibase.setContexts("dev");
        liquibase.setShouldRun(false);
        return liquibase;
    }
    
}
