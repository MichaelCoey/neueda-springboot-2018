package uk.ac.belfastmet.dwarfssaved.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarfssaved.repository.DwarfRepository;

@Controller
@RequestMapping("")
public class ViewController {
	
	DwarfRepository dwarfRepository;
	
	
	
	public ViewController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}
	
	@GetMapping("/view/{dwarfId}")
	public String view(@PathVariable("dwarfId") Integer dwarfId, Model model) {
		

		
		model.addAttribute("pageTitle","View");
		model.addAttribute("dwarf",this.dwarfRepository.findByDwarfId(dwarfId));
	
		return "view.html";
	}

}
