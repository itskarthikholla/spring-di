package com.karthik.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello world - Getter Based";
    }
}
