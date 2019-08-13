package com.wenyao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Think on 2019/4/10
 */
@Configuration
@ConditionalOnClass(StarterService.class)
@EnableConfigurationProperties(StarterServiceProperties.class)
public class StarterAutoConfigure {

    @Autowired
    private StarterServiceProperties starterServiceProperties;

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "com.wenyao.service", value = "enabled", havingValue = "true")
    StarterService starterService() {
        return new StarterService(starterServiceProperties.getConfig());
    }
}
