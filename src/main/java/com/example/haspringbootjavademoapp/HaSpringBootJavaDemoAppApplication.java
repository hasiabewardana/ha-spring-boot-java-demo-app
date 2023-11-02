package com.example.haspringbootjavademoapp;

import com.example.haspringbootjavademoapp.dependencyinjection.controllers.ConstructorInjectedController;
import com.example.haspringbootjavademoapp.dependencyinjection.controllers.MyController;
import com.example.haspringbootjavademoapp.dependencyinjection.controllers.PropertyInjectedController;
import com.example.haspringbootjavademoapp.dependencyinjection.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HaSpringBootJavaDemoAppApplication {

    public static void main(String[] args) {
//		Dependency injection
        ApplicationContext ac = SpringApplication.run(HaSpringBootJavaDemoAppApplication.class, args);

        System.out.println("\n");
        System.out.println("---Primary---");
        MyController mc = (MyController) ac.getBean("myController");
        System.out.println(mc.sayHello());

        System.out.println("\n");
        System.out.println("---Property---");
        PropertyInjectedController pic = (PropertyInjectedController) ac.getBean("propertyInjectedController");
        System.out.println(pic.sayHello());

        System.out.println("\n");
        System.out.println("---Setter---");
        SetterInjectedController sic = (SetterInjectedController) ac.getBean("setterInjectedController");
        System.out.println(sic.sayHello());

        System.out.println("\n");
        System.out.println("---Constructor---");
        ConstructorInjectedController cic = (ConstructorInjectedController) ac.getBean("constructorInjectedController");
        System.out.println(cic.sayHello());
    }

}
