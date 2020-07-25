package com.karthik.sfgdi.service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class GetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello world - Getter Based";
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("HI from postconstruct");
    }
}
