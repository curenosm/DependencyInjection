package com.curenosm.didemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

// @Service
// @Profile("es") // Se elige cuál profile está activo desde application.properties
// @Primary
public class PrimarySpanishGreetingService implements GreetingService{

    private GreetingRepository greetingRepository;

    @Autowired
    public PrimarySpanishGreetingService(GreetingRepository greetingRepository){
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting(){
        return greetingRepository.getSpanishGreeting();
    }

}
