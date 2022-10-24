package com.code.springdemo.Spring.Coach;

import com.code.springdemo.Spring.Fortune.FortuneService;

public class BaseballCoach implements Coach {

    //define a private field for dependency
    private FortuneService fortuneService;

    //define a constructor for dependency injection
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice.";
    }

    @Override
    public String getDailyFortune() {
        //use my fortuneService to get a fortune
        return "Hey Baseball Coach! " + fortuneService.getFortune();
    }
}
