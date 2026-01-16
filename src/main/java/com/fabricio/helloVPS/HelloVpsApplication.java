package com.fabricio.helloVPS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class HelloVpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloVpsApplication.class, args);
	}

}
