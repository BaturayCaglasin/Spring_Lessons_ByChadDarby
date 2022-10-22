package com.code.springdemo.beforeSpring;

public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice.";
    }
}
