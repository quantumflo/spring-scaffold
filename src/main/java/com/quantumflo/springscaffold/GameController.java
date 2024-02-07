package com.quantumflo.springscaffold;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
    private Coach myCoach;

    @Autowired
    public GameController(@Qualifier("footballCoach") Coach newCoach ) {
        myCoach = newCoach;
    }
    @GetMapping("/dailyWorkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
