package com.adzarei.learningspring.controllers;

import com.adzarei.learningspring.services.PrimaryGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimaryControllerTest {

    public PrimaryController controller;

    @BeforeEach
    void setUp() {
        controller = new PrimaryController(new PrimaryGreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        assertEquals("Hello World - Primary", controller.getGreeting());
    }
}