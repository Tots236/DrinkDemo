package main;

/* Builds a Beverage array, which supports subclasses
 * then performs a ForAll loop that prints their descriptions.
 * Descriptions are generated in the class constructors.
 */ 
public class DrinkDemo {
	public static void main(String args[]) {

		Beverage[] theMenu = new Beverage[3];
		theMenu[0] = new Juice("Orange Juice", false, "oranges");
		theMenu[1] = new Beer("Budweiser", true, (float) 5);
		theMenu[2] = new Soda("Pepsi", true);
		
		for (Beverage element: theMenu) {
			System.out.print(element.getDescription());
		}
		//Prints Beverage array on one line
		
	}
}
