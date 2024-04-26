package main;
import java.text.DecimalFormat;

/*
 * Beer class is a subclass of Beverage.
 * Includes alcoholContent property and a unique description generator.
 */
public class Beer extends Beverage{
	/*
	 * Using a formatter for alcohol content, so that decimals are supported up to 2 positions,
	 * and rounded beyond that, but will not appear if 0
	 * Ex: 5.50 = 5.5% , 5 = 5%
	 */
	DecimalFormat alcoholFormater = new DecimalFormat("0.##");
	String alcoholContent;
	public Beer(String drinkName, Boolean drinkCarbonated, float drinkAlcoholContent) {
		super(drinkName, drinkCarbonated);
		this.alcoholContent = alcoholFormater.format(drinkAlcoholContent);
		this.description = this.toString();
	}
	
	//Beer descriptions include Name/Carbonation/AlcoholContent, overrides Beverage description
	public String toString() {
		String carbonatedString = null;
		if (carbonated) {
			carbonatedString = "carbonated";
		} else {
			carbonatedString = "not carbonated";
		}
		return this.description = name + ", " + carbonatedString + ", " + alcoholContent + "%. ";
	}
	
	//Getters and Setters	
	public String getAlcoholContent() {
		return alcoholContent;
	}
	public void setAlcoholContent(float alcoholContent) {
		this.alcoholContent = alcoholFormater.format(alcoholContent);
	}
	
}
