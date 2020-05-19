package com.curenosm.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es") // Se elige cuál profile está activo desde application.properties
@Primary
public class PrimarySpanishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Saludos desde el servicio de saludo primario (en espanol)";
    }

}
