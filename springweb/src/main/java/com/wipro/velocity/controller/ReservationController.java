package com.wipro.velocity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.velocity.model.Reservation;

@Controller
public class ReservationController {
	
	@RequestMapping("/bookingForm")
    public String bookingForm(Model theModel) {
        Reservation res= new Reservation();
        theModel.addAttribute("reservation", res);
        return "reservationPage"; //it has reservation obj/attribute
    }
	@RequestMapping("/submitForm")
    public String submitForm(@ModelAttribute("reservation") Reservation res)
    {
        return "confirmationForm";  //view + res obj
    }
}
