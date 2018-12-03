package uk.ac.belfastmet.dwarfssaved.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarfssaved.domain.Dwarf;
import uk.ac.belfastmet.dwarfssaved.service.DwarfService;
//import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/tolkien")
public class TolkienController {
	
	@GetMapping("")
	public String home(Model model){
		
		DwarfService dwarfService = new DwarfService();
		ArrayList<Dwarf> tolkienDwarfs = dwarfService.getTolkienDwarves();
		
		model.addAttribute("pageTitle","Tolkien!");
		model.addAttribute("tolkienDwarfs",tolkienDwarfs);
		return "tolkien.html";
	}


}
