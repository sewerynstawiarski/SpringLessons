package com.example.com.SpringLessons.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SomeExternalServices {
    @Value("${external.service.url}") // from property file
    public String url;


    public String returnServiceURL() {
        return url;
    }
}
