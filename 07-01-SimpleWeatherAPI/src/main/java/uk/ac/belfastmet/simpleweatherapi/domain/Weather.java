package uk.ac.belfastmet.simpleweatherapi.domain;

import lombok.Data;

@Data
public class Weather {
	
	private String description;
	private String precipitation;
	private Integer temperature;
	private String humidity;
	private Integer pressure;
	private Integer cloudcover;
	private Wind wind;
	private String image;

	
	public String toString() {
		
		String weather = this.getDescription() + ", " 
		               + this.getPrecipitation() + ", " 
		               + this.getTemperature() + ", " 
		               + this.getHumidity() + ", " 
		               + this.getPressure() + ", " 
		               + this.getCloudcover() + ", " 
		               + this.getWind() + ", "
		               + this.getImage();
		
		return weather;
	}
}
