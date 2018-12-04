package uk.ac.belfastmet.titaniccrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.titaniccrud.repository.PassengerRepository;

@Controller
@RequestMapping("")
public class PassengerController {
	
	PassengerRepository passengerRepository;
	
	public PassengerController(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}

	@GetMapping("/passenger")
	public String passenger(Model model) {
		
		model.addAttribute("pageTitle","Passenger List");
		model.addAttribute("Passengers", passengerRepository.findAll());
		
		return "passengers.html";
	}

}
