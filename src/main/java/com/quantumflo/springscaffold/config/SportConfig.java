package com.quantumflo.springscaffold.config;

import com.quantumflo.springscaffold.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public SwimCoach swimCoach() {
        return new SwimCoach();
    }

}
