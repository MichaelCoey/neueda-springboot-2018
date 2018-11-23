package uk.ac.belfastmet.largestbuildings.domain;

public class BiggestFloorarea extends Buildings {
	
	private String floorArea;

	public BiggestFloorarea() {
		super();
	}

	public BiggestFloorarea(String name, String country, String place, String image, String googleMap, String floorArea) {
		super(name, country, place, image, googleMap);
		this.floorArea = floorArea;
	}

	public String getFloorArea() {
		return floorArea;
	}

	public void setFloorArea(String floorArea) {
		this.floorArea = floorArea;
	}
	
}
