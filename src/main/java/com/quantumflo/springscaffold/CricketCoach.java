package com.quantumflo.springscaffold;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practise fast bowling for 15 minutes!!!!";
    }
}
