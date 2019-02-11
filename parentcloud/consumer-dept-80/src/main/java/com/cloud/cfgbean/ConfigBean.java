package com.cloud.cfgbean;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean { //@Configuration ConfigBean = applicationContext.xml

    @Bean
    @LoadBalanced //spring cloud Ribbon 是基于Netflix Ribbon 实现的一套客户端 负载均衡的工具
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
