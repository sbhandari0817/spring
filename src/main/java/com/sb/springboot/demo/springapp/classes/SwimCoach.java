package com.sb.springboot.demo.springapp.classes;

public class SwimCoach implements Coach{
    @Override
    public String getWorkout() {
        return "Swim for 100 m";
    }
}
