package com.curenosm.didemo.controller;

import com.curenosm.didemo.service.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }

}
