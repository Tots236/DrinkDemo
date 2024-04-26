package main;

public class DrinkDemo {
	public static void main(String args[]) {

		/* Builds a Beverage array, which supports subclasses
		 * then performs a ForAll loop that prints the description.
		 * Descriptions are generated in the class constructor.
		 */ 
		Beverage[] theMenu = new Beverage[3];
		theMenu[0] = new Juice("Orange Juice", false, "oranges");
		theMenu[1] = new Beer("Budweiser", true, (float) 5);
		theMenu[2] = new Soda("Pepsi", true);
		
		for (Beverage element: theMenu) {
			System.out.print(element.getDescription());
		}
	}
}
