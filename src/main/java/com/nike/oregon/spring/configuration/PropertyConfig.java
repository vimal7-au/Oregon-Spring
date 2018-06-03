package com.nike.oregon.spring.configuration;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@ConfigurationProperties()
public class PropertyConfig {
    private final Map<String, String> priorityMap = new HashMap<>();

    public Map<String, String> getPriority() {
        return priorityMap;
    }

}
