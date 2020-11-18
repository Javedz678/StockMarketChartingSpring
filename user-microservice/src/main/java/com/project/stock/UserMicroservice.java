package com.project.stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserMicroservice {
	@Autowired
	
	public static void main(String[] args) {
		SpringApplication.run(UserMicroservice.class, args);
	}


}
