package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.main.employee.model.Company;
import com.main.employee.model.Employee;

@SpringBootApplication
public class EmailAdminAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailAdminAppApplication.class, args);		
	}
}
