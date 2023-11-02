package com.example.haspringbootjavademoapp.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "GreetingServiceImpl - Hello!";
    }
}
