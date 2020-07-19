package com.karthik.sfgdi.controller;

import com.karthik.sfgdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterBasedController  {

    private GreetingService greetingService;

    public String getGreeting() {
        return  greetingService.sayGreeting();
    }

    @Qualifier("setterInjectedGreetingService")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
