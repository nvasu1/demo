package com.example.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Tomcat port was change from 8080 to 7080");
		SpringApplication.run(DemoApplication.class, args);
	}

}
