package com.curenosm.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Primärer GruBdienst";
    }

}
