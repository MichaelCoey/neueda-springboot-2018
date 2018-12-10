package uk.ac.belfastmet.breakfastcereals.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.breakfastcereals.domain.Cereal;
import uk.ac.belfastmet.breakfastcereals.repositories.CerealRepository;


@Controller
@RequestMapping("")
public class AddController {
	
	CerealRepository cerealRepository;
	
	public AddController(CerealRepository cerealRepository) {
		super();
		this.cerealRepository = cerealRepository;
	}
	
	@GetMapping("/add")
	public String addCereal(Model model) {
		
		model.addAttribute("pageTitle", "Add");
		model.addAttribute("cereals", new Cereal());
		
		return "edit.html";
	}
	
	@PostMapping("save")
	public String saveCereal(@Valid Cereal cereal, BindingResult bindingResult, Model model) {
		
		
		if(bindingResult.hasErrors()) {
			
			
			return "edit.html";
			
		}
		else {
			
			Cereal savedCereal = this.cerealRepository.save(cereal);
			return "redirect:/view/" + cereal.getCerealId();
			
		}
		
		
	}

}
