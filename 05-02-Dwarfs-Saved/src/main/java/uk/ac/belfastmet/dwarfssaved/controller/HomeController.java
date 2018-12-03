package uk.ac.belfastmet.dwarfssaved.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@GetMapping("")
	public String home(Model model)
	{
		return "index.html";
	}

}
