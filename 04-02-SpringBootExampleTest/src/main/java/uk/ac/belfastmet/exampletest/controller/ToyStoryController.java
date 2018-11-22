package uk.ac.belfastmet.exampletest.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.exampletest.domain.Cast;
import uk.ac.belfastmet.exampletest.service.CastService;


@Controller
@RequestMapping("/toystory")
public class ToyStoryController {
	
	@GetMapping("")
	public String toystory(Model model){
		
		CastService castService = new CastService();
		ArrayList<Cast> toyStoryCast = castService.getToyStoryCast();
		
		model.addAttribute("pageTitle","Toy Story Characters");
		model.addAttribute("toyStoryCast",toyStoryCast);
		model.addAttribute("locationFrame","<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2311.179556680628!2d-5.9684613844783705!3d54.60082938026103!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x4861087b69734c07%3A0xa3ccb022dc102ba9!2se3+Belfast+Met!5e0!3m2!1sen!2suk!4v1542901218265\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
		
		return "toystory.html";
	}
		
}
