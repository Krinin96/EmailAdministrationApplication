package com.employee.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Company {

	private String name;
	private List<String> departments;

	public Company() {
		super();
		departments = new ArrayList();
		
	}
	public Company(String companyName) {
		super();
		this.name = companyName;
		departments = new ArrayList();
	
	}
	public Company(String companyName, String[] companyDepartments) {
		super();
		this.name = companyName;
		departments = new ArrayList();
		
		for(String department : companyDepartments) {
			addDepartment(department);
		}	
	}
	
	public void addDepartment(String departmentName) {
		this.departments.add(departmentName);
	}
	
	public void deleteDepartment(String departmentName) {
		
		for(int i = 0; i< this.departments.size();i++) {
			if(departmentName.equals(this.departments.get(i))) {
				this.departments.remove(i);
			}
		}
		
	}
	public void deleteDepartment(int departmentNumber) {
		this.departments.remove(departmentNumber);
	}
	
	
	
	
	
}
