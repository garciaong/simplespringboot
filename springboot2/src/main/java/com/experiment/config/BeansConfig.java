package com.experiment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.experiment.bean.BeanA;

@Configuration
public class BeansConfig {

    @Bean
    public BeanA beanA1() {
        return new BeanA("This is BeanA1");
    }
    
    @Bean
    public BeanA beanA2() {
        return new BeanA("This is BeanA2");
    }
    
}
