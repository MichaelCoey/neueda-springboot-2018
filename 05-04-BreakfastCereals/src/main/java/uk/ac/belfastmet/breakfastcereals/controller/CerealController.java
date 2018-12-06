package uk.ac.belfastmet.breakfastcereals.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.breakfastcereals.repositories.CerealRepository;

@Controller
@RequestMapping("")
public class CerealController {
	
	CerealRepository cerealRepository;
	
	public CerealController(CerealRepository cerealRepository) {
		super();
		this.cerealRepository = cerealRepository;
	}
	
	@GetMapping("/cereal")
	public String passenger(Model model) {
		
		model.addAttribute("pageTitle","Cereal List");
		model.addAttribute("cereals", cerealRepository.findAll());
		
		return "cereal.html";
	}

}
