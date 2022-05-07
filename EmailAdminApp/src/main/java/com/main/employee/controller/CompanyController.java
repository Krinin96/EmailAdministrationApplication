package com.main.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.main.employee.model.Company;
import com.main.employee.repo.CompanyRepo;

public class CompanyController {

	
	@Autowired
	private CompanyRepo repo;
	
	@GetMapping("/addCompany")
	public ModelAndView addCompany() {
		ModelAndView mav = new ModelAndView("addCompany");
		Company company = new Company();		
		mav.addObject("company",company);
		return mav;
	}
	@PostMapping("/saveCompany")
	public String saveCompany(@ModelAttribute Company company) {
		repo.save(company);
		return "redirect:/addCompany";
	}
}
