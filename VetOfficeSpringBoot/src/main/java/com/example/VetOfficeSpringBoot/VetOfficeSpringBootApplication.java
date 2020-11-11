package com.example.VetOfficeSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VetOfficeSpringBootApplication {

	@Autowired
	Owner owner;


	public static void main(String[] args) {
		SpringApplication.run(VetOfficeSpringBootApplication.class, args);

	}

	@Bean
	CommandLineRunner runner(){
	return args -> {
		System.out.println( owner.makeCatSpeak());
		};
	}
}
