package com.adzarei.learningspring.controllers.manual;

import com.adzarei.learningspring.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;


    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
