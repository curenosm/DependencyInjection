package com.curenosm.didemo.controller;

import com.curenosm.didemo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired // Dejamos el autowired para setters y properties
    @Qualifier("propertyGreetingService")
    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
