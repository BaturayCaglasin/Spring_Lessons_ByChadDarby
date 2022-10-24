package com.code.springdemo.Spring.Main;

import com.code.springdemo.Spring.Coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        //load Spring Configuration File:
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve Beans from Spring Container
        Coach theCoach = context.getBean("BaseballCoach", Coach.class); //Burada Inteface'i çağırmak durumundasın. Bean'in ID'si de; applicationContext.xml'de hangi id'yi koymuşsan o id'yi belirtmek durumundasın.
        Coach theSecondCoach = context.getBean("TennisCoach",Coach.class);


        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theSecondCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theSecondCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
