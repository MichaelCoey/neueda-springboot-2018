package uk.ac.belfastmet.exampletest.domain;

public class Cast {
	
	private String character;
	private String author;
	private String image;
	
	public Cast() {
		super();
	}

	public Cast(String character, String author, String image) {
		super();
		this.character = character;
		this.author = author;
		this.image = image;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	
	
	

}
