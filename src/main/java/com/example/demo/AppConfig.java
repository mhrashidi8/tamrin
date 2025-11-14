package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Engin engin(){
        return new Engin();
    }
    @Bean
    public CAr cAr(){
        return new CAr(engin());
    }
}
