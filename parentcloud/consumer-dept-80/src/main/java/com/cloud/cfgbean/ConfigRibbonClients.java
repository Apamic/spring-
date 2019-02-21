package com.cloud.cfgbean;

import myRule.MySelfRule;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

@Configuration
//name 指定调用那个服务  configuration为调用的配置类
@RibbonClient(name = "PROVIDER-DEPT",configuration = MySelfRule.class)
public class ConfigRibbonClients {

}
