package com.example.haspringbootjavademoapp.dependencyinjection.controllers;

import com.example.haspringbootjavademoapp.dependencyinjection.services.GreetingService;

public class PropertyInjectedController {
    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayHello();
    }
}
