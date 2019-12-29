package com.grahakmanch.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grahakmanch.app.service.HelloService;

@RestController
public class HelloController {
	@Autowired
	HelloService service;
	@GetMapping(value = "/hello")
	public String sayHello() {
			return service.sayHello();
	}
}
