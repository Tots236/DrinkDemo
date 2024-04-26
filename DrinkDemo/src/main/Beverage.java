package main;
/*
 * The Beverage class is the super class for Beer, Soda, and Juice.
 * Provides properties used by all subclasses.
 * Contains a dynamic description that is overridden by the subclasses.
 */
public class Beverage {
	String name = null;
	Boolean carbonated = null;
	String description = "No description";
	public Beverage(String drinkName, Boolean drinkCarbonated) {
		this.name = drinkName;
		this.carbonated = drinkCarbonated;
		this.description = this.toString();
	}
	
	/*
	 * Default Beverage description, overridden by subclasses
	 * as requested by documentation.
	 * Beverage descriptions include just Name.
	*/
	public String toString() {
		return this.description = name + ". ";
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
