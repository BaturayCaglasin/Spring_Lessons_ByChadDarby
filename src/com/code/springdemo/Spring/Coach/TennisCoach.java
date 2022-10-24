package com.code.springdemo.Spring.Coach;

import com.code.springdemo.Spring.Fortune.FortuneService;

public class TennisCoach implements Coach {


    private FortuneService fortuneService;


    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on tennis practice.";
    }

    @Override
    public String getDailyFortune() {
        return "Hey Tennis Coach! " + fortuneService.getFortune();
    }
}
