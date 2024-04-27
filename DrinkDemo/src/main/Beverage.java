package main;
/*
 * The Beverage class is the super class for Beer, Soda, and Juice.
 * Provides properties used by all subclasses.
 * Contains a dynamic description that is overridden by the subclasses.
 */
public class Beverage {
	protected String name = null;
	protected Boolean carbonated = false;
	protected String description = "No description";
	
	public Beverage(String drinkName, Boolean drinkCarbonated) {
		this.name = drinkName;
		this.carbonated = drinkCarbonated;
		this.updateDescription(); 
		//Updates description when object is created or updated via Setter
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String drinkName) {
		this.name = drinkName;
		this.updateDescription();
	}
	public Boolean getCarbonated() {
		return carbonated;
	}
	public void setCarbonated(Boolean drinkCarbonated) {
		this.carbonated = drinkCarbonated;
		this.updateDescription();
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
	protected void updateDescription() {
		this.description = this.name + ". ";
	}	
}
