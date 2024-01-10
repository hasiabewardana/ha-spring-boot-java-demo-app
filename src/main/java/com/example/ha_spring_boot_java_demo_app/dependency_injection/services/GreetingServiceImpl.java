package com.example.ha_spring_boot_java_demo_app.dependency_injection.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "GreetingServiceImpl - Hello!";
    }
}
