package com.huseyinozkan.springcoredemo.config;

import com.huseyinozkan.springcoredemo.common.Coach;
import com.huseyinozkan.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
