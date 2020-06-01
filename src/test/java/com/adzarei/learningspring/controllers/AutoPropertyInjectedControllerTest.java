package com.adzarei.learningspring.controllers;

import com.adzarei.learningspring.services.PropertyGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoPropertyInjectedControllerTest {

    AutoPropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new AutoPropertyInjectedController();
        controller.greetingService = new PropertyGreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
        assertEquals("Hello World - Property", controller.getGreeting());
    }
}