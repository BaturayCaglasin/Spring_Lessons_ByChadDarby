package com.code.springdemo.Spring.Fortune;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "This is a Happy Fortune Service! Today is your lucky day!";
    }
}
