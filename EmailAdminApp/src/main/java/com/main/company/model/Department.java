package com.main.company.model;

import lombok.Data;

@Data
public class Department {

	String departmentName;
	
	
	public Department() {
		super();
	}
	
	public Department(String departmentName) {
		this.departmentName = departmentName;
	}

}
