package uk.ac.belfastmet.breakfastcereals.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uk.ac.belfastmet.breakfastcereals.repositories.CerealRepository;

@Controller
@RequestMapping("")
public class SearchController {
	
	CerealRepository cerealRepository;
	
	public SearchController(CerealRepository cerealRepository) {
		super();
		this.cerealRepository = cerealRepository;
	}
	
	@GetMapping("/searchid")
	public String searchId(@RequestParam("id") Integer cerealId, Model model)
	{
		model.addAttribute("pageTitle", "Search Results By ID");
		model.addAttribute("cereals", this.cerealRepository.findByCerealId(cerealId));
		
		return "cereal.html";
	}
	
	@GetMapping("/searchmanufacturer")
	public String searchName(@RequestParam("manufacturer") String manufacturer, Model model)
	{
		model.addAttribute("pageTitle", "Search Results By manufacturer");
		model.addAttribute("cereals", this.cerealRepository.findByManufacturerContaining(manufacturer));
		
		return "cereal.html";
		
		
	}
	

}
