package com.simplilearn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan("com.simplilearn.demo") //controller location

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
