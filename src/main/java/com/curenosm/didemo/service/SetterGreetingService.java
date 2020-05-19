package com.curenosm.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello, I was implemented via the setter";
    }

}
