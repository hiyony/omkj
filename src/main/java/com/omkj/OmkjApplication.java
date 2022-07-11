package com.omkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.omkj")
@SpringBootApplication
public class OmkjApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmkjApplication.class, args);
	}

}
