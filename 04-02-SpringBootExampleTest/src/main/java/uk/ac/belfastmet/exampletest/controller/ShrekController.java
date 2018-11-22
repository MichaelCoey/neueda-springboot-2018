package uk.ac.belfastmet.exampletest.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.exampletest.domain.Cast;
import uk.ac.belfastmet.exampletest.service.CastService;

@Controller
@RequestMapping("/shrek")
public class ShrekController {
	
	@GetMapping("")
	public String shrek (Model model) {
		
		CastService castService = new CastService();
		ArrayList<Cast> shrekCast = castService.getShrekCast();
		
		model.addAttribute("pageTitle","Shrek Characters");
		model.addAttribute("shrekCast",shrekCast);
		return "shrek.html";
		
	}

}
