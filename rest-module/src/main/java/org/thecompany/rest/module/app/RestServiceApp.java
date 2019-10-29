package org.thecompany.rest.module.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.thecompany")
public class RestServiceApp {
	
	public static void main(String[] args) {
		SpringApplication.run(RestServiceApp.class, args);
	}
}
