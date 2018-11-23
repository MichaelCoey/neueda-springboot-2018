package uk.ac.belfastmet.largestbuildings.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.largestbuildings.domain.BiggestVolume;
import uk.ac.belfastmet.largestbuildings.service.BuildingService;

@Controller
@RequestMapping("/biggestvolume")
public class BiggestVolumeController {
	
	@GetMapping("")
	public String biggestvolume(Model model) {
		
		BuildingService buildingService = new BuildingService();
		ArrayList<BiggestVolume> volumeBuildings = buildingService.getVolumeBuildings();
		
		
		model.addAttribute("pageTitle","Biggest by Volume");
		model.addAttribute("volumeBuildings",volumeBuildings);
		
		return "bigestvolume.html";
	}

}
