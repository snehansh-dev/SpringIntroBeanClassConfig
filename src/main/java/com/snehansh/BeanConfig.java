package com.snehansh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.snehansh")
public class BeanConfig {

    @Bean
    public Staff staff(){
        return new Staff();
    }
}
