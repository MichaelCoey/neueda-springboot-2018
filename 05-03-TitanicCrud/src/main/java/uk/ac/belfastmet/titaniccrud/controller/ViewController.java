package uk.ac.belfastmet.titaniccrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.titaniccrud.repository.PassengerRepository;

@Controller
@RequestMapping("")
public class ViewController {
	
	PassengerRepository passengerRepository;
	
	public ViewController(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}
	
	@GetMapping("/view/{passengerId}")
	public String view(@PathVariable("passengerId") Integer passengerId, Model model) {
		
		model.addAttribute("pageTitle","View");
		model.addAttribute("passenger",this.passengerRepository.findByPassengerId(passengerId));
		
		return "view.html";
	}

}
