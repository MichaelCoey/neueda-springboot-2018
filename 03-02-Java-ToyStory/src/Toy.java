public class Toy {
	
	private String toyName;
	private String actorFirstName;
	private String actorLastName;
	
	public String getToyName() {
		return toyName;
	}
	
	public void setToyName(String toyName) {
		this.toyName = toyName;
	}
	
	public String getActorFirstName() {
		return actorFirstName;
	}
	
	public void setActorFirstName(String actorFirstName) {
		this.actorFirstName = actorFirstName;
	}
	
	public String getActorLastName() {
		return actorLastName;
	}
	
	public void setActorLastName(String actorLastName) {
		this.actorLastName = actorLastName;
	}

	public Toy() {
		super();
	}

	public Toy(String toyName, String actorFirstName, String actorLastName) {
		super();
		this.toyName = toyName;
		this.actorFirstName = actorFirstName;
		this.actorLastName = actorLastName;
	}
	
	
	
	
	

}
