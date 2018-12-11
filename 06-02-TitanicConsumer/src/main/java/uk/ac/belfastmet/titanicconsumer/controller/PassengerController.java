package uk.ac.belfastmet.titanicconsumer.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.titanicconsumer.domain.AllPassengers;
import uk.ac.belfastmet.titanicconsumer.domain.Passenger;
import uk.ac.belfastmet.titanicconsumer.service.PassengerServiceImpl;


@Controller
@RequestMapping("/titanic")
public class PassengerController {
	
	@Autowired
	PassengerServiceImpl passengerService;
	AllPassengers allPassengers;
	
	public PassengerController() {
		super();
	}
	
	
	public PassengerController(PassengerServiceImpl passengerService) {
		super();
		this.passengerService = passengerService;

	}
	
	
	public PassengerController(PassengerServiceImpl passengerService, AllPassengers allPassengers) {
		super();
		this.passengerService = passengerService;
		this.allPassengers = allPassengers;
	}

	
	@GetMapping("")
	public String listPassenger(Model model) {
		
		model.addAttribute("pageTitle", "List Passengers");
		
		ArrayList<Passenger> passengers = this.passengerService.list();
		model.addAttribute("passengers", passengers);
		
		return "passengersPage.html";
	}
	

	@GetMapping("/add/")
	public String addPassenger(Model model) {
		
		model.addAttribute("pageTitle", "Add");
		model.addAttribute("passenger", new Passenger());
		
		return "edit.html";
	}
	
	
	@GetMapping("/view/{passengerId}")
	public String view(@PathVariable("passengerId") Integer passengerId, Model model) {
		
		model.addAttribute("pageTitle","View");
		model.addAttribute("passenger",this.passengerService.get(passengerId));
		
		return "view.html";
	}
	
	
	@GetMapping("/edit/{passengerId}")
	public String editPassenger(@PathVariable("passengerId") Integer passengerId, Model model) {
		
		Passenger passenger = this.passengerService.get(passengerId);
		
		model.addAttribute("pageTitle", "Edit Passenger");
		model.addAttribute("passenger", passenger);
		
		return "edit.html";
	}
	
	
	@PostMapping("/save")
	public String savePassenger(Passenger passenger, @RequestParam("addUpdate") String addUpdate,  Model model) {
		
		
		if(addUpdate.equals("Add Passenger")) {
			
			this.passengerService.add(passenger);
			return "redirect:/titanic";
			
		}
		else {
			
			this.passengerService.update(passenger);
			return "redirect:/titanic/view/" + passenger.getPassengerId();
			
		}	
	}
	
	
	@GetMapping("/delete/{passengerId}")
	public String delete(@PathVariable("passengerId") Integer passengerId, Model model, RedirectAttributes redirectAttributes) {
		
		
		
		this.passengerService.delete(passengerId);	
		redirectAttributes.addFlashAttribute("message", "Passenger deleted successfully");
		redirectAttributes.addFlashAttribute("messageId", passengerId);
	
		return "redirect:/titanic";
	}
}
