package com.employee.model;

import javax.persistence.Entity;

import lombok.Data;
import lombok.Getter;

@Data
@Entity
public class Employee {

	private long id;
	private String firstName;
	private String lastName;
	private int departmentNumber;
	private String email;
	private Company company;

	
	
	public Employee() {
		super();
	}

	


	public Employee( String firstName,String lastName,  Company company,int departmentNumber) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.departmentNumber = departmentNumber;		
		this.company = company;	
		this.email = generateEmail();
	}

	public Employee( String firstName, String lastName, Company company) {
		super();		
		this.firstName = firstName;
		this.lastName = lastName;
		this.company = company;
	}

	public String generateEmail() {
		return getLastName() + getFirstName() + "@" + getCompany().getName()+"."
				+ getCompany().getDepartments().get(getDepartmentNumber())+".com";
	}

	
	
	
	
	
	
}
