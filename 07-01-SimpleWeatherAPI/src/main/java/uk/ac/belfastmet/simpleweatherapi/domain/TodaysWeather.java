package uk.ac.belfastmet.simpleweatherapi.domain;

import java.util.Map;

import lombok.Data;

@Data
public class TodaysWeather {
	
	private Location location;
	private Weather weather;
	private Wind wind;
	
}
