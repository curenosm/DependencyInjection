package com.curenosm.didemo;

import com.curenosm.didemo.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        // Lets get a bean
        // MyController myController = (MyController) ctx.getBean("myController");
        MyController myController = ctx.getBean("myController", MyController.class);

        myController.hello();
    }

}
