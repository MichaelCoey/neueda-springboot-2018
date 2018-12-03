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
@RequestMapping("/disney")
public class DisneyController {
	
	@GetMapping("")
	public String home(Model model){
		
		DwarfService dwarfService = new DwarfService();
		ArrayList<Dwarf> disneyDwarfs = dwarfService.getDisneyDwarfs();
		
		
		
		model.addAttribute("pageTitle","Disney Dwarfs");
		model.addAttribute("disneyDwarfs",disneyDwarfs);
		return "disney.html";
	}

}
