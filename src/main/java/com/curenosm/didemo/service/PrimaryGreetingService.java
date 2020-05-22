package com.curenosm.didemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

// @Service
// @Primary // Por defecto se va a inyectar este Bean al implementar sin Qualifier
// @Profile("en") // Si hay mas de un servicio Primary, se pueden usar profiles para decidir cual usar
// @Profile({"en", "default"}) // Si le pasamos un Array con un segundo elemento llamado "default"
// lo va a elegir en caso de que no se especifique el Profile en application.properties
public class PrimaryGreetingService implements GreetingService{

    private GreetingRepository greetingRepository;

    @Autowired
    public PrimaryGreetingService(GreetingRepository greetingRepository){
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
