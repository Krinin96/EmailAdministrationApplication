package com.employee.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.main.employee.model.Company;
import com.main.employee.model.Employee;

class EmployeeTest {

	Employee employee = null;
	Company company = null;

	@BeforeEach
	public void setUp() {

		String[] departmentNames = { "testOne", "testTwo", "testThree" };
		company = new Company("testCompany", departmentNames);
		
	}

	@Test
	public void generateEmailTest() {
		
		assertEquals("lastNameTestfirstNameTest@testCompany.testOne.com", employee.getEmail());
	}

	
}
