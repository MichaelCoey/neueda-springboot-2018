package uk.ac.belfastmet.sbcontroller.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@RestController
@RequestMapping("/toystory")

public class ToyStory {
	
	@GetMapping("woody")
	public String woody(Model model) {
		
		return "Woody was played by Tom Hanks";
		
	}
	
	@GetMapping("buzz")
	public String buzz(Model model) {
		
		return "Buzz was played by Tim Allen";
		
	}
	
	@GetMapping("slinky")
	public String slinky(Model model) {
		
		return "Slinky was played by Jim Varney";
		
	}
	
	@GetMapping("ham")
	public String ham(Model model) {
		
		return "Ham was played by John Ratzenberger";
		
	}
	
	@GetMapping("rex")
	public String rex(Model model) {
		
		return "Rex was played by Wallace Shawn";
		
	}
	
	@GetMapping("potatohead")
	public String potatohead(Model model) {
		
		return "Mr. Potato Head was played by Don Rickies";
	}
		
}
