package com.karthik.sfgdi.controller;

import com.karthik.sfgdi.service.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterBasedControllerTest {
    SetterBasedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterBasedController();
        controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}