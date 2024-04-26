package main;

public class Soda extends Beverage{
	public Soda(String drinkName, Boolean drinkCarbonated) {
		super(drinkName, drinkCarbonated);
		this.description = this.toString();
	}	
	
	//Soda descriptions include Name/Carbonation, overrides Beverage description
	public String toString() {
		String carbonatedString = null;
		if (carbonated) {
			carbonatedString = "carbonated";
		} else {
			carbonatedString = "not carbonated";
		}
		return this.description = name + ", " + carbonatedString + ". ";
	}
}