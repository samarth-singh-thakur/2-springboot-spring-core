package com.luv2code.util;

import org.springframework.stereotype.Component;

//Component annotation marks the class as a spring bean and makes it available for dependency injection
@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 1000 mins!!!!";
    }
}
