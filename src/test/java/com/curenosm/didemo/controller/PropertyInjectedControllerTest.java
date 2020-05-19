package com.curenosm.didemo.controller;

import com.curenosm.didemo.service.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @BeforeEach
    public void setUp() throws Exception {
        // Se puede crear la instancia
        this.propertyInjectedController = new PropertyInjectedController();
        // Inyectando la dependencia después de inicializado el objeto
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_GUYS, propertyInjectedController.sayHello());
    }
}
