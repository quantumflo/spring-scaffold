package com.quantumflo.springscaffold;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class FootballCoach implements Coach{


    @Override
    public String getDailyWorkout() {
        return "Practise volley for 15 minutes";
    }
}
