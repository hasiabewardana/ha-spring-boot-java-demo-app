package com.example.ha_spring_boot_java_demo_app.dependency_injection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "I18nEnglishGreetingServiceImpl - Hello!";
    }
}
