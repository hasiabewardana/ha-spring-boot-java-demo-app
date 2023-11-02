package com.example.haspringbootjavademoapp.dependencyinjection.controllers;

import com.example.haspringbootjavademoapp.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyGreetingServiceImpl")
    @Autowired
    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayHello();
    }
}
