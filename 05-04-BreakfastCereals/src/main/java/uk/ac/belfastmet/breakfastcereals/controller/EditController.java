package uk.ac.belfastmet.breakfastcereals.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.breakfastcereals.repositories.CerealRepository;

@Controller
@RequestMapping("")
public class EditController {
	
	CerealRepository cerealRepository;
	
	public EditController(CerealRepository cerealRepository) {
		super();
		this.cerealRepository = cerealRepository;
	}
	
	@GetMapping("/edit/{cerealId}")
	public String editPassenger(@PathVariable("cerealId") Integer cerealId, Model model) {
		
		model.addAttribute("pageTitle", "Edit Cereal");
		model.addAttribute("cereals", this.cerealRepository.findByCerealId(cerealId));
		
		return "edit";
	}

}
