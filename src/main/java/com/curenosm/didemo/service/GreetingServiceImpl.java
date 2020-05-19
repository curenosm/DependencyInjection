package com.curenosm.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GUYS = "Hello guys!!!";

    @Override
    public String sayGreeting() {
        return HELLO_GUYS;
    }
}
