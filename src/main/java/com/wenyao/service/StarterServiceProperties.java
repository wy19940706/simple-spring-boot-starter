package com.wenyao.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Think on 2019/4/10
 */
@ConfigurationProperties("com.wenyao.service")
public class StarterServiceProperties {

    private String config;

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}
