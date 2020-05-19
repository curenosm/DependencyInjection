package com.curenosm.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello, I was injected via the property";
    }

}
