package com.Athletics.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(
				title="Athletics",
				version="1.1.2",
				description="Athletics Details and Project",
				contact=@Contact(
						name="Sivavarshini",
						email="sivavarshinimurugesan18@gmail.com"
						)
				)	
		)
public class AthleticsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AthleticsApplication.class, args);
	}

}