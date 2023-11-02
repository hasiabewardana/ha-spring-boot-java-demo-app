package com.example.haspringbootjavademoapp.dependencyinjection.controllers;

import com.example.haspringbootjavademoapp.dependencyinjection.services.GreetingService;
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
