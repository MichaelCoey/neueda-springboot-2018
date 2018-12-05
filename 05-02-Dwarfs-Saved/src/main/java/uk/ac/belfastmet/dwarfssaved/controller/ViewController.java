package uk.ac.belfastmet.dwarfssaved.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.dwarfssaved.repository.DwarfRepository;

@Controller
@RequestMapping("")
public class ViewController {
	
	DwarfRepository dwarfRepository;
	
	
	
	public ViewController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}
	
	@GetMapping("/dwarfs")
	public String allDwarfs(Model model) {
		

		
		model.addAttribute("pageTitle","All Dwarfs");
		model.addAttribute("disneyDwarfs",this.dwarfRepository.findAll());
	
		return "dwarfPage.html";
	}
	
	@GetMapping("/view/{dwarfId}")
	public String view(@PathVariable("dwarfId") Integer dwarfId, Model model) {
		

		
		model.addAttribute("pageTitle","View");
		model.addAttribute("dwarf",this.dwarfRepository.findByDwarfId(dwarfId));
	
		return "view.html";
	}
	
	@GetMapping("/delete/{dwarfId}")
	public String delete(@PathVariable("dwarfId") Integer dwarfId, Model model, RedirectAttributes redirectAttributes) {
		
		
		
		this.dwarfRepository.deleteById(dwarfId);		
		redirectAttributes.addFlashAttribute("message", "Dwarf deleted successfully");
		redirectAttributes.addFlashAttribute("messageId", dwarfId);
	
		return "redirect:/dwarfs";
	}

}
