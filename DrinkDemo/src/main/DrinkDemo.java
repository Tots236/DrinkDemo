package main;

public class DrinkDemo {
	public static void main(String args[]) {

		/*
		 * 
		 */
		Beverage[] theMenu = new Beverage[3];
		theMenu[0] = new Juice("Orange Juice", false, "orange");
		theMenu[1] = new Beer("Budweiser", true, (float) 5.5);
		theMenu[2] = new Soda("Pepsi", true);
		
		for (Beverage element: theMenu) {
			System.out.print(element.getDescription());
		}
	}
}
