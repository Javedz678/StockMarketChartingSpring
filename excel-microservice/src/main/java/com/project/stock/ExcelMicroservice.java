package com.project.stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExcelMicroservice {
	@Autowired
	
	public static void main(String[] args) {
		SpringApplication.run(ExcelMicroservice.class, args);
	}


}
