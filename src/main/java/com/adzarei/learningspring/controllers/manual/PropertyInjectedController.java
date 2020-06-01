package com.adzarei.learningspring.controllers.manual;

import com.adzarei.learningspring.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
