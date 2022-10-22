package com.code.springdemo.beforeSpring;

public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on tennis practice.";
    }
}
