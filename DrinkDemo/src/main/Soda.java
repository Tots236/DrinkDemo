package main;

/*
 * Soda class is a subclass of Beverage.
 * No unique properties but does have a unique description format.
 */

public class Soda extends Beverage{	
	public Soda(String drinkName, Boolean drinkCarbonated) {
		super(drinkName, drinkCarbonated);
		this.updateDescription();
	}
	
	//Getters and Setters
	//Soda descriptions include Name/Carbonation, overrides Beverage setDescription
	protected void updateDescription() {
		String carbonatedString = null;
		try {
			if (this.carbonated) {
				carbonatedString = "carbonated";
			} else {
				carbonatedString = "not carbonated";
			}
		} catch (NullPointerException e) {
			System.err.println("NullPointerException in Soda.toString(). Is carbonated boolean null?");
		} catch (Exception f) {
			System.err.println("Non-Null Exception occured in Soda.toString()");
		}
		this.description = this.name + ", " + carbonatedString + ". ";
	}
	
}