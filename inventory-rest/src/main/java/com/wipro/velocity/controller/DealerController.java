package com.wipro.velocity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.velocity.exception.ResourceNotFoundException;
import com.wipro.velocity.model.Dealer;
import com.wipro.velocity.repository.DealerRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api")
public class DealerController {
	
	@Autowired
	private DealerRepository drepo;
	
	//POST - http://localhost:9095/ims/api/registerDealer
	
	@PostMapping("/registerDealer")
	public String saveDealer(@RequestBody Dealer dealer)
	{
		drepo.save(dealer);
		
		return "Dealer Registered Successfully";
	}
	
	//GET - http://localhost:9095/ims/api/findAllDealers
	
	@GetMapping("/findAllDealers")
	public List<Dealer> getDealerList()
	{
		return drepo.findAll();
	}
	
	//POST - http://localhost:9095/ims/api/loginDealer
	
	@PostMapping("/loginDealer")
	public Boolean loginDealer(@Validated @RequestBody Dealer dealer) throws 
	ResourceNotFoundException
	{
		Boolean  isLogin=false;
		String email=dealer.getEmail();
		String password=dealer.getPassword();
		
		Dealer d=drepo.findByEmail(email).orElseThrow(() ->
		new ResourceNotFoundException("Unknown Dealer"));
		
		if(email.equals(d.getEmail()) && password.equals(d.getPassword()))
		{
			isLogin=true;
		}
		return isLogin;
	}

}
