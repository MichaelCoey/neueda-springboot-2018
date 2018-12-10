package uk.ac.belfastmet.breakfastcereals.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.breakfastcereals.repositories.CerealRepository;



@Controller
@RequestMapping("")
public class DeleteController {

	CerealRepository cerealRepository;
	
	public DeleteController(CerealRepository cerealRepository) {
		super();
		this.cerealRepository = cerealRepository;
	}
	
	@GetMapping("/delete/{cerealId}")
	public String delete(@PathVariable("cerealId") Integer cerealId, Model model, RedirectAttributes redirectAttributes) {
		
		
		
		this.cerealRepository.deleteById(cerealId);		
		redirectAttributes.addFlashAttribute("message", "Cereal deleted successfully");
		redirectAttributes.addFlashAttribute("messageId", cerealId);
	
		return "redirect:/cereal";
	}
	
}
