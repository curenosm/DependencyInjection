package com.curenosm.didemo.service;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository{

    @Override
    public String getEnglishGreeting() {
        return "Hello primary greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Que tranza carnal";
    }

    @Override
    public String getGermanGreeting() {
        return "Generic german greeting";
    }
}
