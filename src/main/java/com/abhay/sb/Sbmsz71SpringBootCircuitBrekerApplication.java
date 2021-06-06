package com.abhay.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class Sbmsz71SpringBootCircuitBrekerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sbmsz71SpringBootCircuitBrekerApplication.class, args);
	}

}
