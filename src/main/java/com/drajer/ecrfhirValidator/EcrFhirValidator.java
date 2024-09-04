package com.drajer.ecrfhirValidator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.drajer.ecrfhirValidator.*")
public class EcrFhirValidator {

	public static void main(String[] args) {
		SpringApplication.run(EcrFhirValidator.class, args);
	}

}
