package com.curenosm.didemo.controller;

import com.curenosm.didemo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    // Lo mismo para este setter, dado que hay más de una
    // implementacion de la iterfaz GreetingService
    @Autowired // Pero aquí sí dejamos el Autowired
    // @Qualifier("setterGreetingService") // Puede ir afuera o en los parametros
    public void setGreetingService(
            @Qualifier("setterGreetingService") GreetingService greetingService){
        this.greetingService = greetingService;
    }

}
