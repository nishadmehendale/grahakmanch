package com.grahakmanch.app.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

	public String sayHello() {
		return "{ \"message\" : \"Hello World\" }";
	}

}
