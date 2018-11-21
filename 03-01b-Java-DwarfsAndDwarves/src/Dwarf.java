
public class Dwarf {
	
	//Variables
	private String name;
	private String author;
	private String image;
	
	//Get/Set
	public String getName() {
		return name;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getImage() {
		return image;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setImage(String image) {
		this.image = image;
	}

	//Default Constructor
	public Dwarf() {
		super();
	}
	
	//Override constructor
	public Dwarf(String name, String author, String image) {
		super();
		this.name = name;
		this.author = author;
		this.image = image;
	}
	
}
