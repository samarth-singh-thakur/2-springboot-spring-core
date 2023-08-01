package com.luuv2code.springcoredemo.rest;

import com.luuv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;
    private Coach anotherCoach;
    //constructor injection
    @Autowired
    public  DemoController(@Qualifier("cricketCoach") Coach theCoach,
                           @Qualifier("cricketCoach") Coach theAnotherCoach){
        System.out.println("In Constructor: "+getClass().getSimpleName());
        anotherCoach = theAnotherCoach;
        myCoach = theCoach;
        
    }


//  ---------

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        
        return myCoach.getDailyWorkout();
    }
    
    @GetMapping("/check")
    public boolean check(){
        return myCoach == anotherCoach;
    }
}
