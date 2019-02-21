package com.cloud.cfgbean;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean { //@Configuration ConfigBean = applicationContext.xml

//    @Bean
//    @LoadBalanced //spring cloud Ribbon 是基于Netflix Ribbon 实现的一套客户端 负载均衡的工具
//    public RestTemplate getRestTemplate() {
//        return new RestTemplate();
//    }


//    @Bean
//    public IRule myRule(){
//        return new RandomRule();//随机
//        //return new RoundRobinRule();//默认轮询。
//        //return new RetryRule();//先按照RoundRobinRule的策略服务，如果获取服务失败则在指定时间内会进行重试，若指定时间内获取失败，则会跳过去获取其他可用的服务。
//        //return new BestAvailableRule();//会先过滤由于多次访问故障而处于断路器跳闸状态的服务，然后选择一个并发量最小的服务。
//        //return new AvailabilityFilteringRule();//会先过滤由于多次访问故障而处于断路器跳闸状态的服务，还有并发的连接数量超过阈值的服务，然后对剩余的服务列表用轮询进行访问。
//        //return new WeightedResponseTimeRule();//根据平均响应时间计算所有服务的权重，响应时间越快服务权重越大被选中的概率越高。刚启动时如果统计信息不足，则使用RoundRobinRule策略，等统计信息足够，会切换到WeightedResponseTimeRule。
//        //return new ZoneAvoidanceRule();//默认规则复合判断server所在区域的性能和server的可用性选择服务器。
//    }

}
