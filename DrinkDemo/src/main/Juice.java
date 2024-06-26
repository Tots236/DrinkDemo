package main;

/*
 * Juice class is a subclass of Beverage.
 * Includes fruit property and a unique description format.
 */
public class Juice extends Beverage{
	protected String fruit; 
	//For grammatical reasons, fruit name should be plural. (apples vs apple)
	
	public Juice(String drinkName, Boolean drinkCarbonated, String drinkFruit) {
		super(drinkName, drinkCarbonated);
		this.fruit = drinkFruit; 
		this.updateDescription();
	}
	
	//Getters and Setters
	public String getFruit() {
		return fruit;
	}
	public void setFruit(String fruit) {
		this.fruit = fruit;
		this.updateDescription();
	}
	//Juice descriptions include Name/Carbonation/FruitMadeFrom, overrides Beverage setDescription
	protected void updateDescription() {
		String carbonatedString = null;
		try {
			if (carbonated) {
				carbonatedString = "carbonated";
			} else {
				carbonatedString = "not carbonated";
			}
		} catch (NullPointerException e) {
			System.err.println("NullPointerException in Juice.toString(). Is carbonated boolean null?");
		} catch (Exception f) {
			System.err.println("Non-Null Exception occured in Juice.toString()");
		}
		this.description = name + ", " + carbonatedString + ", made from " + fruit + ". ";
	}
}
