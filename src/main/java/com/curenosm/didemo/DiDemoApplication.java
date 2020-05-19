package com.curenosm.didemo;

import com.curenosm.didemo.controller.ConstructorInjectedController;
import com.curenosm.didemo.controller.MyController;
import com.curenosm.didemo.controller.PropertyInjectedController;
import com.curenosm.didemo.controller.SetterInjectedController;
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

        // Le pedimos que nos de un bean
        PropertyInjectedController pIC = ctx.getBean(PropertyInjectedController.class);
        // NoSuchBeanDefinitionException si no inyectamos la dependencia, para eso
        // Hay que anotarla en el controlador con Autowired
        System.out.println(pIC.sayHello());

        // Lo mismo para los demás controladores
        SetterInjectedController sIC = ctx.getBean(SetterInjectedController.class);
        System.out.println(sIC.sayHello());

        ConstructorInjectedController cIC = ctx.getBean(ConstructorInjectedController.class);
        System.out.println(cIC.sayHello());
    }

}
