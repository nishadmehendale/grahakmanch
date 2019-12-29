package com.grahakmanch.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grahakmanch.app.dao.EmployeeDao;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao dao;
	
	public String addEmployee() {
		//dao.save(e);
		System.out.println("Employee Added");
		return "{ \"message\" : \"Employee Added\" }";
	}
	
	public String updateEmployee() {
		//dao.save(e);
		System.out.println("Employee Updated");
		return "{ \"message\" : \"Employee Updated\" }";
	}
	
	public String deleteEmployee() {
		//dao.save(e);
		System.out.println("Employee Deleted");
		return "{ \"message\" : \"Employee Deleted\" }";
	}
	
	public String viewEmployee() {
		//dao.findById(employeeId);
		System.out.println("Employee Viewed");
		return "{ \"message\" : \"Employee Viewed\" }";
	}
	
}
