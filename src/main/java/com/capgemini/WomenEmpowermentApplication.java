package com.capgemini;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class WomenEmpowermentApplication {
	private static final Logger LOG = LoggerFactory.getLogger(WomenEmpowermentApplication.class);
	public static void main(String[] args) {
		
		System.out.println("Start");
		SpringApplication.run(WomenEmpowermentApplication.class, args);
		LOG.info("End");
	}

}
