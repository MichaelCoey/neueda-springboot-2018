package uk.ac.belfastmet.simpleweatherapi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.simpleweatherapi.domain.TodaysWeather;

@Controller
@RequestMapping("")
public class WeatherController {
	
	@GetMapping("")
	public String home() {
		
		return "index.html";
		
	}
	
	@GetMapping("/weather/{location}")
	public String belfast(@PathVariable("location") String location, Model model) {
		
		//Build for Belfast first
		String belfastWeatherUrl = "http://www.codingfury.net/training/weathersample/weather.php?location="+location;
		
		//Does not usually go here
		RestTemplate restTemplate = new RestTemplate();
		TodaysWeather todaysWeather = restTemplate.getForObject(belfastWeatherUrl, TodaysWeather.class);
		
		//Adding the object
		model.addAttribute("todaysWeather", todaysWeather);
		
		//Logging output
		Logger logger = LoggerFactory.getLogger(TodaysWeather.class);
		logger.info(todaysWeather.getLocation().toString());
		logger.info(todaysWeather.getWeather().toString());
		logger.info(todaysWeather.getWeather().getWind().toString());
				
		return "weather.html";
	}
	
	@GetMapping("/weathers")
	public String allLocations(Model model) {
		
		//URL Links
		String belfastWeatherUrl = "http://www.codingfury.net/training/weathersample/weather.php?location=belfast";
		String dublinWeatherUrl = "http://www.codingfury.net/training/weathersample/weather.php?location=dublin";
		String londonWeatherUrl = "http://www.codingfury.net/training/weathersample/weather.php?location=london";
		
		//Does not usually go here
		RestTemplate restTemplate = new RestTemplate();
		
		TodaysWeather belfastWeather = restTemplate.getForObject(belfastWeatherUrl, TodaysWeather.class);
		TodaysWeather dublinWeather = restTemplate.getForObject(dublinWeatherUrl, TodaysWeather.class);
		TodaysWeather londonWeather = restTemplate.getForObject(londonWeatherUrl, TodaysWeather.class);
		
		//Adding the object
		model.addAttribute("belfastWeather", belfastWeather);
		model.addAttribute("dublinWeather", dublinWeather);
		model.addAttribute("londonWeather", londonWeather);
				
		return "weathers.html";
	}

}
