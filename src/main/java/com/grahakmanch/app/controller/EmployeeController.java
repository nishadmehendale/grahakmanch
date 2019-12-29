package com.grahakmanch.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grahakmanch.app.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@GetMapping(value = "/employee")
	public String viewEmployee() {
			return service.viewEmployee();
	}
	
	@PostMapping(value = "/employee")
	public String addEmployee() {
			return service.addEmployee();
	}
	
	@PutMapping(value = "/employee")
	public String updateEmployee() {
			return service.updateEmployee();
	}
	
	@DeleteMapping(value = "/employee")
	public String deleteEmployee() {
			return service.deleteEmployee();
	}
}
