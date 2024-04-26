package main;

public class Beverage {
	//Properties shared by all Beverages and subclasses
	String name = null;
	Boolean carbonated = false;
	String description = "No description";
	public Beverage(String drinkName, Boolean drinkCarbonated) {
		this.name = drinkName;
		this.carbonated = drinkCarbonated;
		this.description = this.toString();
	}
	
	/*
	 * Default Beverage description, overridden by subclasses
	 * as requested by documentation.
	 * Beverage descriptions include Name/Carbonation
	*/
	public String toString() {
		String carbonatedString = null;
		if (carbonated) {
			carbonatedString = "carbonated";
		} else {
			carbonatedString = "not carbonated";
		}
		return this.description = name + ", " + carbonatedString + ". ";
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getCarbonated() {
		return carbonated;
	}
	public void setCarbonated(Boolean carbonated) {
		this.carbonated = carbonated;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}	
}
