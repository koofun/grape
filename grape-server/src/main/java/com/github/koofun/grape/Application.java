package com.github.koofun.grape;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.github.koofun.grape")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
