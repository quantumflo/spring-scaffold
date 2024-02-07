package com.quantumflo.springscaffold;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practise fast bowling for 15 minutes!!!!";
    }

    //Define init method
    @PostConstruct
    public void initMethod() {
        System.out.println(" init method" + getClass().getSimpleName());
    }
    @PreDestroy
    public void endMethod() {
        System.out.println(" end method" + getClass().getSimpleName());
    }
}
