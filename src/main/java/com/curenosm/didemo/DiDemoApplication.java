package com.curenosm.didemo;

import com.curenosm.didemo.controller.ConstructorInjectedController;
import com.curenosm.didemo.controller.MyController;
import com.curenosm.didemo.controller.PropertyInjectedController;
import com.curenosm.didemo.controller.SetterInjectedController;
import com.curenosm.didemo.examplebeans.FakeDataSource;
import com.curenosm.didemo.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// @ComponentScan(basePackages = {"com.curenosm.didemo"}) // Desde donde vas a escanear los beans
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        LifeCycleDemoBean lifeCycleDemoBean = ctx.getBean(LifeCycleDemoBean.class);

        // Lets get a bean
        // MyController myController = (MyController) ctx.getBean("myController");
        MyController myController = ctx.getBean("myController", MyController.class);

        myController.hello();

        // Le pedimos que nos de un bean
        PropertyInjectedController pIC = ctx.getBean(PropertyInjectedController.class);
        // NoSuchBeanDefinitionException si no inyectamos la dependencia, para eso
        // Hay que anotarla en el controlador con Autowired

        // Lo mismo para los demás controladores
        SetterInjectedController sIC = ctx.getBean(SetterInjectedController.class);

        ConstructorInjectedController cIC = ctx.getBean(ConstructorInjectedController.class);

        // System.out.println(pIC.sayHello());
        // System.out.println(sIC.sayHello());
        // System.out.println(cIC.sayHello());

        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUser());

        FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
        System.out.println(fakeJmsBroker.getUsername());

    }

}
