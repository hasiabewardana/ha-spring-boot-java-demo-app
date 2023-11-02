package com.example.haspringbootjavademoapp.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService{
    @Override
    public String sayHello() {
        return "SetterGreetingServiceImpl - Hello!";
    }
}
