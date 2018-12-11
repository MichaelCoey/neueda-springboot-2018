package uk.ac.belfastmet.titanicconsumer.domain;


public class Passenger {

	private Integer passengerId;
	private Integer pClass, age, sibSp, parch;
	private Boolean survived;
	private String name, sex, ticket, cabin, embarked;
	private Double fare;
		
	public Passenger() {
		super();
	}


	public Passenger(Integer pClass, Integer age, Integer sibSp, Integer parch, Boolean survived,
			String name, String sex, String ticket, String cabin, String embarked, Double fare) {
		super();

		this.pClass = pClass;
		this.age = age;
		this.sibSp = sibSp;
		this.parch = parch;
		this.survived = survived;
		this.name = name;
		this.sex = sex;
		this.ticket = ticket;
		this.cabin = cabin;
		this.embarked = embarked;
		this.fare = fare;
	}


	public Integer getPassengerId() {
		return passengerId;
	}


	public void setPassengerId(Integer passengerId) {
		this.passengerId = passengerId;
	}


	public Integer getpClass() {
		return pClass;
	}


	public void setpClass(Integer pClass) {
		this.pClass = pClass;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public Integer getSibSp() {
		return sibSp;
	}


	public void setSibSp(Integer sibSp) {
		this.sibSp = sibSp;
	}


	public Integer getParch() {
		return parch;
	}


	public void setParch(Integer parch) {
		this.parch = parch;
	}


	public Boolean getSurvived() {
		return survived;
	}


	public void setSurvived(Boolean survived) {
		this.survived = survived;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getTicket() {
		return ticket;
	}


	public void setTicket(String ticket) {
		this.ticket = ticket;
	}


	public String getCabin() {
		return cabin;
	}


	public void setCabin(String cabin) {
		this.cabin = cabin;
	}


	public String getEmbarked() {
		return embarked;
	}


	public void setEmbarked(String embarked) {
		this.embarked = embarked;
	}


	public Double getFare() {
		return fare;
	}


	public void setFare(Double fare) {
		this.fare = fare;
	}
	
	
	
}


