package de.zeroco.restuarant.menu;

import java.util.Map;

import de.zeroco.main.Utility;

public class Menu{
	
	/**
	 * Displays the list of menu categories available in the restaurant.
	 * 
	 * @author Tejaswini.S
	 * @since 31-01-2025
	 * @return A string listing the available menu categories: Tea, Coffee, Desserts, and Non-Desserts.
	 * @reviewed by 
	 */
	public String displayItems() {
		return "1) Tea\n2) Coffee\n3) Desserts\n4) Non-Desserts";
	}
	
	/**
	 * Handles the menu operations based on the selected category (option) and choice.
	 * 
	 * @author Tejaswini.S
	 * @since 31-01-2025
	 * @param option
	 * @param choice
	 * @param menuOperation
	 * @param map
	 * @param item
	 * @param price
	 * @return void This method does not return a value, it performs the operation directly.
	 * @reviewed by 
	 */
	public void menu(String option, int choice, MenuOperation menuOperation, Map<String, Integer> map, String item, int price) {
		if (Utility.isBlank(option) || Utility.isBlank(choice) || Utility.isBlank(menuOperation) || Utility.isBlank(map) || Utility.isBlank(item) || Utility.isBlank(price)) return;
		switch (option) {
		case "Coffee":
		case "Tea":
		case "Desserts":
		case "Non-Desserts": 
			selectAction(choice, menuOperation, map, item, price);
			break;
		default:
			System.out.println("Invalid option!");
		}
	}
	
	/**
	 * Displays the available menu operations for the user to choose from.
     * The operations include adding, removing, updating, and displaying items in the menu.
	 * 
	 * @author Tejaswini.S
	 * @since 31-01-2025
	 * @return A string listing the available operations with corresponding numbers for user selection.
	 * @reviewed by 
	 */
	public String displayMenuOperations() {
		return "1) Add New Item" + "\n" + "2) Remove Item" + "\n" + "3) Update Item" + "\n" + "4) Display Item\n";
	}
	
	/**
	 * Executes the appropriate menu operation based on the user's choice.
     * The method handles four possible actions: adding an item, removing an item,
     * updating the price of an item, and displaying the entire menu.
     * 
	 * @author Tejaswini.S
	 * @since 31-01-2025
	 * @param choice
	 * @param menuOperation
	 * @param map
	 * @param item
	 * @param price
	 * @return void This method does not return a value, it performs the operation directly.
	 * @reviewed by 
	 */
	public void selectAction(int choice, MenuOperation menuOperation, Map<String, Integer> map, String item, int price) {
		if (Utility.isBlank(choice) || Utility.isBlank(menuOperation) || Utility.isBlank(map) || Utility.isBlank(item) || Utility.isBlank(price)) return;
		switch(choice) {
		case 1:
			menuOperation.addItem(map, item, price);
			break;
		case 2:
			menuOperation.removeItem(map, item);
			break;
		case 3:
			menuOperation.updatePrice(map, item, price);
			break;
		case 4:
			menuOperation.displayMenu(map);
			break;
		default:
			System.out.println("Invalid option!");
		}
	}
	
//	public static void main(String[] args) {
//		MenuOperation menuOperation = new MenuOperation();
//		Menu menu = new Menu();
//		Map<String, Integer> coffee = new HashMap<String, Integer>();
//		Map<String, Integer> tea = new HashMap<String, Integer>();
//		Map<String, Integer> dessert = new HashMap<String, Integer>();
//		Map<String, Integer> nonCoffee = new HashMap<String, Integer>();
// 		menuOperation.addItem(coffee, "Espresso", 25);
//		menuOperation.addItem(coffee, "Double Espresso", 20);
//		menuOperation.addItem(coffee, "Latte", 30);
//		menuOperation.addItem(coffee, "Americano", 30);
//		menuOperation.addItem(tea, "Mango Tea", 10);
//		menuOperation.addItem(tea, "Lemon Tea", 10);
//		menuOperation.addItem(tea, "Jasmine Tea", 10);
//		menuOperation.addItem(tea, "Mint Tea", 10);
//		menuOperation.addItem(tea, "Green Tea", 10);
//		menuOperation.addItem(dessert, "StrawBerry Waffle", 70);
//		menuOperation.addItem(dessert, "Cinnamon Roll", 80);
//		menuOperation.addItem(dessert, "Lemon Pie", 60);
//		menuOperation.addItem(dessert, "Crossiant", 50);
//		menuOperation.addItem(dessert, "Cappuccino", 70);
//		menuOperation.addItem(nonCoffee, "Hot Chocolate", 80);
//		menuOperation.addItem(nonCoffee, "Milk Shake", 80);
//		menuOperation.addItem(nonCoffee, "Smoothie", 90);
//		menuOperation.addItem(nonCoffee, "Vanilla Milkshake", 100);
//		System.out.println(coffee);
//		System.out.println(tea);
//		System.out.println(dessert);
//		System.out.println(nonCoffee);
////		System.out.println(menuOperation.displayMenu(coffee));
////		System.out.println(menuOperation.displayMenu(tea));
////		System.out.println(menuOperation.displayMenu(nonCoffee));
////		System.out.println(menuOperation.displayMenu(dessert));
////		System.out.println(menu.displayItems());
////		System.out.println(menu.displayMenuOperations());
//		
//		
//		menu.menu("Coffee", 1, menuOperation, coffee, "Black Coffee", 20);
//		System.out.println(coffee);
//	}
}



