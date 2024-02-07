package com.quantumflo.springscaffold;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{


    @Override
    public String getDailyWorkout() {
        return "Practise volley for 15 minutes";
    }
}
