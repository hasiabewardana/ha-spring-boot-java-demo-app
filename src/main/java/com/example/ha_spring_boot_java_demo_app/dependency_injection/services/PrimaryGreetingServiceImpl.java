package com.example.ha_spring_boot_java_demo_app.dependency_injection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "PrimaryGreetingServiceImpl - Hello!";
    }
}
