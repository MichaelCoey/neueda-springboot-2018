package uk.ac.belfastmet.largestbuildings.domain;

public class BiggestVolume extends Buildings {

	private String floorArea;
	private String volume;
	private String description;
	
	public BiggestVolume() {
		super();
	}

	public BiggestVolume(String name, String country, String place, String image, String googleMap, String floorArea, String volume, String description) {
		super(name, country, place, image, googleMap);
		this.floorArea = floorArea;
		this.volume = volume;
		this.description = description;
	}

	public String getFloorArea() {
		return floorArea;
	}

	public void setFloorArea(String floorArea) {
		this.floorArea = floorArea;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
