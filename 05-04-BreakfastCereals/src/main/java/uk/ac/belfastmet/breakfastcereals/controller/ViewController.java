package uk.ac.belfastmet.breakfastcereals.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.breakfastcereals.repositories.CerealRepository;

@Controller
@RequestMapping("")
public class ViewController {
	
	CerealRepository cerealRepository;
	
	public ViewController(CerealRepository cerealRepository) {
		super();
		this.cerealRepository = cerealRepository;
	}
	
	@GetMapping("/view/{cerealId}")
	public String view(@PathVariable("cerealId") Integer cerealId, Model model) {
		
		model.addAttribute("pageTitle","View");
		model.addAttribute("cereal",this.cerealRepository.findByCerealId(cerealId));
		
		return "view.html";
	}

}
