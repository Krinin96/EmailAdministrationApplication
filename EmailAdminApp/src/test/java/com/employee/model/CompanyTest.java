package com.employee.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.main.employee.model.Company;

class CompanyTest {


	private Company company = null;
	
	@BeforeEach
	public void setUp() {
		String[] departmentNames = { "testOne", "testTwo", "testThree" };
		company = new Company("testCompany",departmentNames);		
	}
	@Test
	public void constructorTest() {
		assertEquals("testCompany",company.getName());
		List<String>list = new ArrayList<>();
		list.add("testOne");
		list.add("testTwo");
		list.add("testThree");
		assertEquals(list,company.getDepartments());
		
	}
	
	@Test
	public void isInListTest() {
		assertEquals(true,company.inList("testOne"));
		
	}
	
	@Test
	public void deleteUsingStringTest() {
		company.deleteDepartment("testOne");
		assertEquals(false,company.inList("testOne"));
		
	}
	
}


