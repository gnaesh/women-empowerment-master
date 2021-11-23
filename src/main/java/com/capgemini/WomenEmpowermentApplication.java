package com.capgemini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WomenEmpowermentApplication {

	public static void main(String[] args) {
		System.out.println("Start");
		SpringApplication.run(WomenEmpowermentApplication.class, args);
		System.out.println("End");
	}

}
