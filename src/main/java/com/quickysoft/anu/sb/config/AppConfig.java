package com.quickysoft.anu.sb.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {
    @Value("${external.get.url:http://localhost:8080/get-external-data}")
    public String externalApiUrl;

    public String getExternalApiUrl() {
        return externalApiUrl;
    }

    public void setExternalApiUrl(String externalApiUrl) {
        this.externalApiUrl = externalApiUrl;
    }
}
