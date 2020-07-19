package com.karthik.sfgdi.controller;

import com.karthik.sfgdi.service.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void testGreeting() {
        System.out.println(controller.getGreeting() );
    }
}