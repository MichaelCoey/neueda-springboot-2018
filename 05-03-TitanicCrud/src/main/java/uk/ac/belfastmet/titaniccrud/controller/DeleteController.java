package uk.ac.belfastmet.titaniccrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.titaniccrud.repository.PassengerRepository;

@Controller
@RequestMapping("")
public class DeleteController {
	
	PassengerRepository passengerRepository;
	
	public DeleteController(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}
	

	
	@GetMapping("/delete/{passengerId}")
	public String delete(@PathVariable("passengerId") Integer passengerId, Model model, RedirectAttributes redirectAttributes) {
		
		
		
		this.passengerRepository.deleteById(passengerId);		
		redirectAttributes.addFlashAttribute("message", "Passenger deleted successfully");
		redirectAttributes.addFlashAttribute("messageId", passengerId);
	
		return "redirect:/passenger";
	}

}
