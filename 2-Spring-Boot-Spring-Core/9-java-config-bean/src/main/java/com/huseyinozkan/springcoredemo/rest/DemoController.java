package com.huseyinozkan.springcoredemo.rest;

import com.huseyinozkan.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;


    @Autowired
    public DemoController(@Qualifier("aquatic") Coach myCoach) {

        System.out.println("In constructor : " + getClass().getSimpleName());
        this.myCoach = myCoach;

    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
