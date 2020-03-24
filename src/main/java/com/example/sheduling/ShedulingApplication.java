package com.example.sheduling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ShedulingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShedulingApplication.class, args);
	}

}
