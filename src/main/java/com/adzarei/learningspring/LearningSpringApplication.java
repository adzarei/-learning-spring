package com.adzarei.learningspring;

import com.adzarei.learningspring.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearningSpringApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(LearningSpringApplication.class, args);

		System.out.println("-------> My Controller");
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);

		System.out.println("-------> Primary Controller");
		// No Qualifier provided. Primary Bean loaded.
		PrimaryController primaryController = (PrimaryController) ctx.getBean("primaryController");
		System.out.println(primaryController.getGreeting());


		System.out.println("-------> Constructor Controller");
		AutoConstructorInjectedController constructorController =
				(AutoConstructorInjectedController) ctx.getBean("autoConstructorInjectedController");
		System.out.println(constructorController.getGreeting());

		System.out.println("-------> Setter Controller");
		AutoSetterInjectedController setterInjectedController =
				(AutoSetterInjectedController) ctx.getBean("autoSetterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-------> Property Controller");
		AutoPropertyInjectedController propertyInjectedController =
				(AutoPropertyInjectedController) ctx.getBean("autoPropertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

	}

}
