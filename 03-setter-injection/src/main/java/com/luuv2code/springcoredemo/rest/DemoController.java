package com.luuv2code.springcoredemo.rest;

import com.luuv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

    //constructor injection
//    @Autowired
//    public  DemoController(Coach theCoach){
//        myCoach = theCoach;
//    }

//    --------
//    @Autowired
//    public void setCoach(Coach theCoach){
//        myCoach = theCoach;
//    }

    @Autowired
    public void doSomeStuff(Coach theCoach){
        myCoach = theCoach;
    }
//  ---------

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
