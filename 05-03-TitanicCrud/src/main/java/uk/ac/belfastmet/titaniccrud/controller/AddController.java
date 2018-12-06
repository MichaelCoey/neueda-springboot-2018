package uk.ac.belfastmet.titaniccrud.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.titaniccrud.domain.Passenger;
import uk.ac.belfastmet.titaniccrud.repository.PassengerRepository;


@Controller
@RequestMapping("")
public class AddController {
	
	PassengerRepository passengerRepository;
	
	public AddController(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}
	
	
	@GetMapping("/add")
	public String addPassenger(Model model) {
		
		model.addAttribute("pageTitle", "Add");
		model.addAttribute("Passengers", new Passenger());
		
		return "edit";
	}
	
	@PostMapping("save")
	public String savePassenger(@Valid Passenger passenger, BindingResult bindingResult, Model model) {
		
		
		if(bindingResult.hasErrors()) {
			
			
			return "edit.html";
			
		}
		else {
			
			Passenger savedPassenger = this.passengerRepository.save(passenger);
			return "redirect:/view/" + passenger.getPassengerId();
			
		}
		
		
	}

}
