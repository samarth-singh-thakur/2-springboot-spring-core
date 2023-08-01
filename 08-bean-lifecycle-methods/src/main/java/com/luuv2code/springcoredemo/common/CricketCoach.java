package com.luuv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

//Component annotation marks the class as a spring bean and makes it available for dependency injection
@Component
public class CricketCoach implements Coach{

    //define our init method
    @PostConstruct
    public void doMyStartupSruff(){
        System.out.println("in do my startup"+getClass().getSimpleName());
    }
    //define our destroy method
    @PreDestroy
    public void iHaveBecomeDeath(){
        System.out.println("in i have become death"+getClass().getSimpleName());

    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 1000 milns!!!!";
    }
}
