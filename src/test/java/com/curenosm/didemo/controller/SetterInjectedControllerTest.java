package com.curenosm.didemo.controller;

import com.curenosm.didemo.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @BeforeEach
    public void setUp() throws Exception {
        // Se puede crear la instancia
        this.setterInjectedController = new SetterInjectedController();
        // Inyectando la dependencia por medio del setter
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
        // Si se crea el bean sin usar constructor, puede haber un error en
        // tiempo de ejecución, normalmente NullPointerException(desventaja)
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_GUYS, setterInjectedController.sayHello());
    }

}
