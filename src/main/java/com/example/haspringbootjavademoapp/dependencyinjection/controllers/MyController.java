package com.example.haspringbootjavademoapp.dependencyinjection.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("My Controller - Hello!");

        return "My Controller - Hello World!";
    }
}
