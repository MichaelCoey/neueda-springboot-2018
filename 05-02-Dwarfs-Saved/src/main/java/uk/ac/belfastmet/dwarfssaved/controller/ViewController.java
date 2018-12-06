package uk.ac.belfastmet.dwarfssaved.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.dwarfssaved.domain.Dwarf;
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
	
	
	@GetMapping("/add")
	public String addDwarf(Model model) {
		
		model.addAttribute("pageTitle", "Add");
		model.addAttribute("dwarf", new Dwarf());
		
		return "edit";
	}
	
	@GetMapping("/edit/{dwarfId}")
	public String editDwarf(@PathVariable("dwarfId") Integer dwarfId, Model model) {
		
		model.addAttribute("pageTitle", "Edit");
		model.addAttribute("dwarf", this.dwarfRepository.findByDwarfId(dwarfId));
		
		return "edit";
	}
	
	@PostMapping("save")
	public String saveDwarf(@Valid Dwarf dwarf, BindingResult bindingResult, Model model) {
		
		
		if(bindingResult.hasErrors()) {
			
			
			return "edit.html";
			
		}
		else {
			
			Dwarf savedDwarf = this.dwarfRepository.save(dwarf);
			return "redirect:/view/" + dwarf.getDwarfId();
			
		}
		
		
	}
	
	

}
