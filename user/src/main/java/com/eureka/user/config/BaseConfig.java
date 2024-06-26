package com.eureka.user.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

// import com.netflix.loadbalancer.IRule;
// import com.netflix.loadbalancer.RandomRule;
@Configuration
public class BaseConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    // @Bean
    // public IRule randomRule() {
    //     return new RandomRule();
    // }
}
