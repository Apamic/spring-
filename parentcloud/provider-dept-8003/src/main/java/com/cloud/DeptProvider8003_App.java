package com.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;


@MapperScan(value = "com.cloud.dao")
@ComponentScan(basePackages = {"com.cloud.entities","com.cloud.controller","com.cloud.service"})
@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient  //服务发现
public class DeptProvider8003_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8003_App.class,args);
    }


}
