package com.code.springdemo.beforeSpring;

public class main {
    public static void main(String[] args) {
        //create an object
        Coach baseballCoach= new BaseballCoach();
        Coach tennisCoach = new TennisCoach();
        //use the object
        System.out.println(baseballCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyWorkout());
    }
}
