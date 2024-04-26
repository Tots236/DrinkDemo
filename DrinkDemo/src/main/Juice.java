package main;

public class Juice extends Beverage{
	public String fruit;
	public Juice(String drinkName, Boolean drinkCarbonated, String drinkFruit) {
		super(drinkName, drinkCarbonated);
		this.fruit = drinkFruit;
		this.description = this.toString();
	}
	
	//Juice descriptions include Name/Carbonation/FruitMadeFrom, overrides Beverage description
	public String toString() {
		String carbonatedString = null;
		if (carbonated) {
			carbonatedString = "carbonated";
		} else {
			carbonatedString = "not carbonated";
		}
		return this.description = name + ", " + carbonatedString + ", made from " + fruit + ". ";
	}
	
	//Getters and Setters
	public String getFruit() {
		return fruit;
	}
	public void setFruit(String fruit) {
		this.fruit = fruit;
	}
}
