package uk.ac.belfastmet.titaniccrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uk.ac.belfastmet.titaniccrud.repository.PassengerRepository;


@Controller
@RequestMapping("")
public class SearchController {
	
	PassengerRepository passengerRepository;
	
	public SearchController(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}
	
	
	
	@GetMapping("/searchid")
	public String searchId(@RequestParam("id") Integer passengerId, Model model)
	{
		model.addAttribute("pageTitle", "Search Results By ID");
		model.addAttribute("Passengers", this.passengerRepository.findByPassengerId(passengerId));
		
		return "passengers.html";
	}
	
	@GetMapping("/searchname")
	public String searchName(@RequestParam("name") String name, Model model)
	{
		model.addAttribute("pageTitle", "Search Results By Name");
		model.addAttribute("Passengers", this.passengerRepository.findByNameContaining(name));
		
		return "passengers.html";
		
		
	}
	
	@GetMapping("/searchsex")
	public String searchSex(@RequestParam("sex") String sex, Model model)
	{
		model.addAttribute("pageTitle", "Search Results By Sex");
		model.addAttribute("Passengers", this.passengerRepository.findBySex(sex));
		
		return "passengers.html";
		
		
	}

}
