package main;
import java.text.DecimalFormat;

/*
 * Beer class is a subclass of Beverage.
 * Includes alcoholContent property and a unique description format.
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
		this.setDescription();
		this.description = this.getDescription();
	}
	
	public String getAlcoholContent() {
		return alcoholContent;
	}
	public void setAlcoholContent(float alcoholContent) {
		this.alcoholContent = alcoholFormater.format(alcoholContent);
		this.setDescription();
	}
	//Beer descriptions include Name/Carbonation/AlcoholContent, overrides Beverage description
	protected void setDescription() {
		String carbonatedString = null;
		try {
			if (carbonated) {
				carbonatedString = "carbonated";
			} else {
				carbonatedString = "not carbonated";
			}
		} catch (NullPointerException e) {
			System.err.println("NullPointerException in Beer.toString(). Is carbonated boolean null?");
		} catch (Exception f) {
			System.err.println("Non-Null Exception occured in Beer.toString()");
		}
		this.description = name + ", " + carbonatedString + ", " + alcoholContent + "%. ";
	}
	
}
