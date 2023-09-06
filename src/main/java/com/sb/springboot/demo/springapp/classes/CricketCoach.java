package com.sb.springboot.demo.springapp.classes;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getWorkout() {
        return "Run 20 minutes";
    }
}
