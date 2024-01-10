package com.example.ha_spring_boot_java_demo_app.dependency_injection.controllers;

import com.example.ha_spring_boot_java_demo_app.dependency_injection.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        System.out.println("My Controller - Hello!");

        return greetingService.sayHello();
    }
}
