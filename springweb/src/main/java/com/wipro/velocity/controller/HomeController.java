package com.wipro.velocity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/myHome", method = RequestMethod.GET)
	public String showHome(ModelMap model) {
	    model.addAttribute("user", "Mike");
	    model.addAttribute("d", new java.util.Date());
        return "home";  // return model + view name
    }
	
	@RequestMapping("/spring")
    public String showSecond()
    {
        return "second"; //returns view
    }
}