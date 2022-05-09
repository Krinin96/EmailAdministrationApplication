package com.main.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.main.company.model.Department;
import com.main.employee.model.Employee;
import com.main.employee.repo.EmployeeRepo;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeRepo repo;
	
	@GetMapping({"/employees","/"})
	public ModelAndView showAllEmployees() {
		ModelAndView mav = new ModelAndView("allEmployees");		
		List<Employee> list = repo.findAll();
		mav.addObject("employees", list);
		return mav;		
	}
	
	@GetMapping("/addEmployeeForm")
	public ModelAndView addEmployeeForm() {
		ModelAndView mav = new ModelAndView("addEmployeeForm");
		Employee employee = new Employee();		
		mav.addObject("employee",employee);
		return mav;
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute Employee employee) {
		repo.save(employee);
		return "redirect:employees";
	}
	
	@ModelAttribute("departments")
	public List<Department> getDepartments(){
		List<Department> list = new ArrayList<>();
		list.add(new Department("IT"));
		list.add(new Department("Accounting"));
		list.add(new Department("Devlopment"));
		list.add(new Department("Sales"));
		return list;
	}
	
	
}
