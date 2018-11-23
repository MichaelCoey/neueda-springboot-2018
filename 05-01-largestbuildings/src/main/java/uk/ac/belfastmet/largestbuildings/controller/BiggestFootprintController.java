package uk.ac.belfastmet.largestbuildings.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.largestbuildings.domain.BiggestFootprint;
import uk.ac.belfastmet.largestbuildings.service.BuildingService;

@Controller
@RequestMapping("/biggestfootprint")
public class BiggestFootprintController {
	
	@GetMapping("")
	public String biggestfootprint(Model model) {
		
		//CODE NEEDED HERE TO DISPLAY
		BuildingService buildingService = new BuildingService();
		ArrayList<BiggestFootprint> footprintBuildings = buildingService.getFootprintBuildings();
		
		
		model.addAttribute("pageTitle","Biggest by Footprint");
		model.addAttribute("footprintBuildings",footprintBuildings);
		
		
		
		
		
		return "biggestfootprint.html";
	}

}
