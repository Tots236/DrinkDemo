package main;

/*
 * Soda class is a subclass of Beverage.
 * No unique properties but does have a unique description generator.
 */

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