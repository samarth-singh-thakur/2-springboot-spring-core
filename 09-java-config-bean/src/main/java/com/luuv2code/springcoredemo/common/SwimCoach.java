package com.luuv2code.springcoredemo.common;

public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("In construcctor "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swime 1000 meter as a warm up";
    }
}
