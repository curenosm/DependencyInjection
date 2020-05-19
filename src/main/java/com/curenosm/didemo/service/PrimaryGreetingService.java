package com.curenosm.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary // Por defecto se va a inyectar este Bean al implementar sin Qualifier
@Profile("en") // Si hay mas de un servicio Primary, se pueden usar profiles para decidir cual usar
public class PrimaryGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello, from the primary greeting service!";
    }
}
