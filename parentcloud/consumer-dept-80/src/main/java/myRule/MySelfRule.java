package myRule;


import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 该类为Ribbon的配置类
 * 注意：该类不能放在主应用程序上下文@ComponentScan所扫描的包中，否则配置将会被所有Ribbon Client共享。
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
        return new RandomRule();
    }
}
