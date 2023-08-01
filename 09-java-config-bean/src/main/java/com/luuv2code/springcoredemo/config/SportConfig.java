package com.luuv2code.springcoredemo.config;

import com.luuv2code.springcoredemo.common.Coach;
import com.luuv2code.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
