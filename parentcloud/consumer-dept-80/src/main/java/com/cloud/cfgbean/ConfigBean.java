package com.cloud.cfgbean;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean { //@Configuration ConfigBean = applicationContext.xml

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
