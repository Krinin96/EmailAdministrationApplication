package com.main.employee.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String lastName;
	private String firstName;
	private int departmentNumber;
	private String email;	

	public Employee(String firstName, String lastName,  int departmentNumber) {
		super();

		this.firstName = firstName;
		this.lastName = lastName;
		this.departmentNumber = departmentNumber;		
	}

	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		
	}

//	public String generateEmail() {
//		return this.lastName + this.firstName + "@" + this.company.getName() + "."
//				+ this.company.getDepartments().get(this.departmentNumber) + ".com";
//	}
//
//	public String toString() {
//		return this.firstName + " " + this.lastName + ", " + this.company.getName() + ", department "
//				+ this.company.getDepartments().get(this.departmentNumber);
//	}

}
