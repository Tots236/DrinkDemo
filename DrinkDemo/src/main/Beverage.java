package main;
/*
 * The Beverage class is the super class for Beer, Soda, and Juice.
 * Provides properties used by all subclasses.
 * Contains a dynamic description that is overridden by the subclasses.
 */
public class Beverage {
	String name = null;
	Boolean carbonated = false;
	protected String description = "No description";
	public Beverage(String drinkName, Boolean drinkCarbonated) {
		this.name = drinkName;
		this.carbonated = drinkCarbonated;
		this.setDescription(); 
		//Updates description when object is created or updated via Setter
		this.description = this.getDescription();
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String drinkName) {
		this.name = drinkName;
		this.setDescription();
	}
	public Boolean getCarbonated() {
		return carbonated;
	}
	public void setCarbonated(Boolean drinkCarbonated) {
		this.carbonated = drinkCarbonated;
		this.setDescription();
	}
	public String getDescription() {
		return description;
	}
	/*
	 * setDescription updates the drinks Description on creation or when a Setter,
	 * is called. Overridden by subclasses.
	 * Is 'protected' and can only be accessed by class + subclasses.
	 * Beverage descriptions include just Name to differentiate.
	*/
	protected void setDescription() {
		this.description = this.name + ". ";
	}	
}
