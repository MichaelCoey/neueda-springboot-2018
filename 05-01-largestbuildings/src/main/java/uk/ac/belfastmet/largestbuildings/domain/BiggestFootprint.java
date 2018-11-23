package uk.ac.belfastmet.largestbuildings.domain;

public class BiggestFootprint extends Buildings {
	
	private String footprint;
	private String lengthWidth;
	private String description;
	
	public BiggestFootprint() {
		super();
	}

	public BiggestFootprint(String name, String country, String place, String image, String googleMap, String footprint, String lengthWidth, String description) {
		super(name, country, place, image, googleMap);
		this.footprint = footprint;
		this.lengthWidth = lengthWidth;
		this.description = description;
	}

	public String getFootprint() {
		return footprint;
	}

	public void setFootprint(String footprint) {
		this.footprint = footprint;
	}

	public String getLengthWidth() {
		return lengthWidth;
	}

	public void setLengthWidth(String lengthWidth) {
		this.lengthWidth = lengthWidth;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
