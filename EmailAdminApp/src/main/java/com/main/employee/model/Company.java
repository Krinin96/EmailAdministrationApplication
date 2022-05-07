package com.main.employee.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import lombok.Data;

@Data
public class Company {

	private String name;
	private List<String> departments;

	public Company() {
		super();
		departments = new ArrayList<String>();
		
	}
	public Company(String companyName) {
		super();
		this.name = companyName;
		departments = new ArrayList<String>();
	
	}
	public Company(String companyName, String[] companyDepartments) {
		super();
		this.name = companyName;
		departments = new ArrayList<String>();
		
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
	
	public boolean inList(String departmentName) {
		for(String string : this.departments) {
			if(departmentName.equals(string)) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		return this.name;
	}
	
	
	
	
}
