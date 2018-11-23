package uk.ac.belfastmet.largestbuildings.domain;

public class Buildings {
	
	private String name;
	private String country;
	private String place;
	private String image;
	private String googleMap;
	
	public Buildings() {
		super();
	}

	public Buildings(String name, String country, String place, String image, String googleMap) {
		super();
		this.name = name;
		this.country = country;
		this.place = place;
		this.image = image;
		this.googleMap = googleMap;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getGoogleMap() {
		return googleMap;
	}

	public void setGoogleMap(String googleMap) {
		this.googleMap = googleMap;
	}
	

}
