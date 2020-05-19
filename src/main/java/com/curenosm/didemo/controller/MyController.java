package com.curenosm.didemo.controller;

import com.curenosm.didemo.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void hello(){
        System.out.println(greetingService.sayGreeting());
    }

}
