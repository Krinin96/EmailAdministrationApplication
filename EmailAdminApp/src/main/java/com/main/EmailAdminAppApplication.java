package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employee.model.Company;
import com.employee.model.Employee;

@SpringBootApplication
public class EmailAdminAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailAdminAppApplication.class, args);
		
		String[] departmentNames = { "testOne", "testTwo", "testThree" };
		Company company = new Company("testCompany", departmentNames);
		Employee employee = new Employee("firstNameTest", "lastNameTest", company, 1);
		
		//employee.generateEmail();
		System.out.println(employee.getEmail());
	
		
	}

}
