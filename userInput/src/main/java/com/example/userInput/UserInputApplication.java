package com.example.userInput;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserInputApplication {

	public static void main(String[] args) {
		System.out.println(args[0]);

		SpringApplication.run(UserInputApplication.class, args);
	}

}
