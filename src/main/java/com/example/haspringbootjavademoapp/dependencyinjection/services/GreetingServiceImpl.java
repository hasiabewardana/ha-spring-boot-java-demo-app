package com.example.haspringbootjavademoapp.dependencyinjection.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "GreetingServiceImpl - Hello!";
    }
}
