package com.wipro.velocity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	//http://localhost:8080/home
		
	@GetMapping("/home")
	public String showIndex()
	{
		return "index";
	}
	@PostMapping("/wipro")
	public String displayHello(@RequestParam("name") String n, Model model)
	{
		model.addAttribute("myName",n);
		return "hello";    //returns view hello.jsp
	}
}
