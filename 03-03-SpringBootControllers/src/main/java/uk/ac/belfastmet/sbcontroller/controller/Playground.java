package uk.ac.belfastmet.sbcontroller.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@RestController
@RequestMapping


public class Playground {
	
	@GetMapping("/")
	public String greeting(Model model) {
		
		return "Hello World!";
		
	}
	
	@GetMapping("/bingo")
	public String bingo(Model model) {
		
		return "<h1>There was a dog in our back yard</h1>";
		
	}
	
	@GetMapping("/belfastmet")
	public String belfastmet(Model model) {
		
		return "Leading the city to work ... hopefully";
		
	}
	
}
