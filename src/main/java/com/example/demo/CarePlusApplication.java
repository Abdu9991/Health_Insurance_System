package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"com.example.demo", "edu.temple.activities"})
public class CarePlusApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarePlusApplication.class, args);
	}

}
