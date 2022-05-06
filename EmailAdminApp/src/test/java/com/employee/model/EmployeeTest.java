package com.employee.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	Employee employee = null;
	Company company = null;

	@BeforeEach
	public void setUp() {

		String[] departmentNames = { "testOne", "testTwo", "testThree" };
		company = new Company("testCompany", departmentNames);
		employee = new Employee("firstNameTest", "lastNameTest", company, 0);
	}

	@Test
	public void generateEmailTest() {
		//employee.setEmail(employee.generateEmail());
		assertEquals("lastNameTestfirstNameTest@testCompany.testOne.com", employee.getEmail());
	}

	
}
