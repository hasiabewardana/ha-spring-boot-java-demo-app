package com.example.haspringbootjavademoapp;

import com.example.haspringbootjavademoapp.dependencyinjection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HaSpringBootJavaDemoAppApplication {

	public static void main(String[] args) {
//		Dependency injection
		ApplicationContext applicationContext = SpringApplication.run(HaSpringBootJavaDemoAppApplication.class, args);
		MyController myController = (MyController)applicationContext.getBean("myController");
		System.out.println(myController.sayHello());
	}

}
