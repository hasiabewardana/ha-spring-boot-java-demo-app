package com.example.ha_spring_boot_java_demo_app.dependency_injection.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService{
    @Override
    public String sayHello() {
        return "SetterGreetingServiceImpl - Hello!";
    }
}
