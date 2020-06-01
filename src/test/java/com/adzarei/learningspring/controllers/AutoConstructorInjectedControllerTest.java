package com.adzarei.learningspring.controllers;

import com.adzarei.learningspring.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoConstructorInjectedControllerTest {
    AutoConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new AutoConstructorInjectedController(new ConstructorGreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
        assertEquals("Hello World - Constructor", controller.getGreeting());
    }
}