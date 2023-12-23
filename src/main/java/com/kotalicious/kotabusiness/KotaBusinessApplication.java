package com.kotalicious.kotabusiness;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class KotaBusinessApplication {

	public static void main(String[] args) {
		SpringApplication.run(KotaBusinessApplication.class, args);
	}

}
