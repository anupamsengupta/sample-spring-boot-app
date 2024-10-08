package com.quickysoft.anu.sb.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {
    @Value("${external.get.url1:http://localhost:8080/external-api}")
    public String externalApiUrl1;

    @Value("${external.get.url2:http://localhost:8080/external-api}")
    public String externalApiUrl2;


    public String getExternalApiUrl1() {
        return externalApiUrl1;
    }

    public void setExternalApiUrl1(String externalApiUrl1) {
        this.externalApiUrl1 = externalApiUrl1;
    }

    public String getExternalApiUrl2() {
        return externalApiUrl2;
    }

    public void setExternalApiUrl2(String externalApiUrl2) {
        this.externalApiUrl2 = externalApiUrl2;
    }
}
