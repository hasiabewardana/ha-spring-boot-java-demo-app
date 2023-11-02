package com.example.haspringbootjavademoapp.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingService{
    @Override
    public String sayHello() {
        return "PropertyGreetingServiceImpl - Hello!";
    }
}
