package com.adzarei.learningspring.controllers;

import com.adzarei.learningspring.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryController {

    private final GreetingService greetingService;

    public PrimaryController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
