package com.wipro.velocity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	//http://localhost:8080
		
	@RequestMapping("/")
	public String hello()
	{
		return "Hello World from Spring Boot";
	}
	@RequestMapping("/test")
	public String hello1()
	{
		return "My First Project in Spring Boot!!!";
	}
}