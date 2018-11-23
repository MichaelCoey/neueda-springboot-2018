package uk.ac.belfastmet.largestbuildings.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.largestbuildings.domain.BiggestFloorarea;
import uk.ac.belfastmet.largestbuildings.service.BuildingService;

@Controller
@RequestMapping("/biggestfloorarea")
public class BiggestFloorareaController {

	@GetMapping("")
	public String biggestfloorarea(Model model) {
		
		
		//CODE NEEDED HERE TO DISPLAY
		BuildingService buildingService = new BuildingService();
		ArrayList<BiggestFloorarea> floorareaBuildings = buildingService.getFloorareaBuildings();
		
		
		model.addAttribute("pageTitle","Biggest by Floor Area");
		model.addAttribute("floorareaBuildings",floorareaBuildings);
		
		return "biggestfloorarea.html";
	}
	
}
