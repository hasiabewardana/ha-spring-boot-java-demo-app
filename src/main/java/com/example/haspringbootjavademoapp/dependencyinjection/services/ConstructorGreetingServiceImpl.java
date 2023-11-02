package com.example.haspringbootjavademoapp.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService{
    @Override
    public String sayHello() {
        return "ConstructorGreetingServiceImpl - Hello!";
    }
}
