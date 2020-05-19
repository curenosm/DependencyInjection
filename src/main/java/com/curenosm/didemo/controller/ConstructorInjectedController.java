package com.curenosm.didemo.controller;

import com.curenosm.didemo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    // Autowire is not required for constructors in latest versions of Spring
    // but it's a good practice for readability
    // @Autowired // OBS: Si existe más de una clase que implementa la interfaz
    // El autowired no funcionará, tenemos que especificar con la anotacion Qualifier
    // a cuál hacemos referencia (recibe el BeanID [nombreDeLaClase]
    public ConstructorInjectedController(
            @Qualifier("constructorGreetingService") GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
