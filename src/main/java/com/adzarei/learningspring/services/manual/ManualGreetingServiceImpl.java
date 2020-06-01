package com.adzarei.learningspring.services.manual;

import com.adzarei.learningspring.services.GreetingService;

public class ManualGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
