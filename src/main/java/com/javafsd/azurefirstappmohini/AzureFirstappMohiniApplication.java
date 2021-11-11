package com.javafsd.azurefirstappmohini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureFirstappMohiniApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureFirstappMohiniApplication.class, args);
	}

	@GetMapping("/welcome")
	public String hello() {
		
		return "Deployement done Successfuly......" ;
	}
}
