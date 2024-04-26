package main;

public class Beer extends Beverage{
	float alcoholContent;
	public Beer(String drinkName, Boolean drinkCarbonated, float drinkAlcoholContent) {
		super(drinkName, drinkCarbonated);
		this.alcoholContent = drinkAlcoholContent;
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
	public float getAlcoholContent() {
		return alcoholContent;
	}
	public void setAlcoholContent(float alcoholContent) {
		this.alcoholContent = alcoholContent;
	}
}
