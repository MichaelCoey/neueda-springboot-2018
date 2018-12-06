package uk.ac.belfastmet.dwarfssaved.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Dwarf {
	
	@Id
	@GeneratedValue
	private Integer dwarfId;
	@NotEmpty
	private String name;
	private String author;
	private String image;
	
	public Dwarf() {
		super();
	}

	public Dwarf(String name, String author, String image) {
		super();
		this.name = name;
		this.author = author;
		this.image = image;
	}
	
	

	public Integer getDwarfId() {
		return dwarfId;
	}

	public void setDwarfId(Integer dwarfId) {
		this.dwarfId = dwarfId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
