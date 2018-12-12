package uk.ac.belfastmet.belfasteventsapi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.belfasteventsapi.domain.AllEvents;
import uk.ac.belfastmet.belfasteventsapi.domain.Events;

@Controller
@RequestMapping("")
public class EventsContoller {
	
	
	
	
	@GetMapping("")
	public String home() {
		
		return "index.html";
		
	}
	
	@GetMapping("/events")
	public String events(Model model) {
		
		
		String eventsUrl = "http://neueda-flask-bndouglas.c9users.io/belfast-events/api/";
		
		
		RestTemplate restTemplate = new RestTemplate();
		AllEvents events = restTemplate.getForObject(eventsUrl, AllEvents.class);
		
		
		model.addAttribute("events", events.getAllEvents());
		
		
		Logger logger = LoggerFactory.getLogger(Events.class);
		logger.info(events.toString());
		
		System.out.println(events);

				
		return "event.html";
	}

}
