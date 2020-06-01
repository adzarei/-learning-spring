package com.adzarei.learningspring.controllers;

import com.adzarei.learningspring.services.SetterGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoSetterInjectedControllerTest {

    AutoSetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new AutoSetterInjectedController();
        controller.setGreetingService(new SetterGreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
        assertEquals("Hello World - Setter", controller.getGreeting());
    }
}