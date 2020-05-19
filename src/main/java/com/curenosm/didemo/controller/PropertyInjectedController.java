package com.curenosm.didemo.controller;

import com.curenosm.didemo.service.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

}
