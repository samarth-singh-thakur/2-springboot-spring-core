package com.luuv2code.springcoredemo.common;
import org.springframework.stereotype.Component;
@Component
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Run a hard 3k!";
    }
}
