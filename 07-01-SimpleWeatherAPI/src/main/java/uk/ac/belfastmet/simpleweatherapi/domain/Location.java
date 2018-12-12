package uk.ac.belfastmet.simpleweatherapi.domain;

import lombok.Data;

@Data
public class Location {
	
	private String name;
	private Float latitude;
	private Float longitude;
	
	public String toString() {
		
		String location = this.getName() + ", " 
						+ this.getLatitude() + ", " 
				        + this.getLongitude() + "\n";
		
		return location;
	}

}
