package com.sb.springboot.demo.springapp.classes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WorkoutConfiguration {

    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
