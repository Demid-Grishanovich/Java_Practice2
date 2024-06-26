package com.pattern.v1.config;

import com.pattern.v1.repository.OrderRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepoConfig {

    @Bean
    public OrderRepository orderRepository() {
        return new OrderRepository();
    }
}
