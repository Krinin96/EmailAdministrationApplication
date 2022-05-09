package com.main.company.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data

public class Company {

	@Id
	private String name;
	

	public Company() {
		super();
	
		
	}
	public Company(String companyName) {
		super();
		this.name = companyName;
		
	
	}	
	
//	public void addDepartment(String departmentName) {
//		this.departments.add(departmentName);
//	}
//	
//	public void deleteDepartment(String departmentName) {
//		
//		for(int i = 0; i< this.departments.size();i++) {
//			if(departmentName.equals(this.departments.get(i))) {
//				this.departments.remove(i);
//			}
//		}
//		
//	}
//	public void deleteDepartment(int departmentNumber) {
//		this.departments.remove(departmentNumber);
//	}
//	
//	public boolean inList(String departmentName) {
//		for(String string : this.departments) {
//			if(departmentName.equals(string)) {
//				return true;
//			}
//		}
//		return false;
//	}
	
	public String toString() {
		return this.name;
	}
	
	
	
	
}
