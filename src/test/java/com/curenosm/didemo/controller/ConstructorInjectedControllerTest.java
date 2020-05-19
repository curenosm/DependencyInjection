package com.curenosm.didemo.controller;

import com.curenosm.didemo.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    public void setUp() throws Exception{
        // No se puede crear una instancia a no ser que se inyecte la dependencia
        // especificada en el constructor
        this.constructorInjectedController = new ConstructorInjectedController(
                new GreetingServiceImpl()
        );
    }

    @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.HELLO_GUYS, this.constructorInjectedController.sayHello());
    }

}
