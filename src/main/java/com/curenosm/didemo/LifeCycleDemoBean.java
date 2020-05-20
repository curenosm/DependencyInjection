package com.curenosm.didemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean,
        DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean(){
        System.out.println("## Hello I'm in the constructor of LifeCycleDemoBean");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## The beanFactory has beeen set");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## My bean name is " + s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## The lifecycle bean has been terminated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The LifeCycleBean has its properties set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## Application Context has been set");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("## The postConstruct annotated method has been called");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("## The predestroy method has been called");
    }

    public void beforeInit(){
        System.out.println("## Called before Init");
    }

    public void afterInit(){
        System.out.println("## Called after Init");
    }
}
