package com.sb.springboot.demo.springapp.classes;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class FootballCoach implements Coach{

    public FootballCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getWorkout() {
        return " Practice Penalty Shootout";
    }
}
