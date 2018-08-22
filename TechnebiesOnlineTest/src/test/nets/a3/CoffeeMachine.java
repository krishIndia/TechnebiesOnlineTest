package test.nets.a3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
	List<Product> dispenser = new ArrayList<Product>();
	int amount = 0;
	
	public void load() {
		Ingredient cup 		= new Ingredient("cup", 30);
		Ingredient water 	= new Ingredient("water", 30);
		Ingredient milk 	= new Ingredient("milk", 5);
		Ingredient sugar 	= new Ingredient("sugar", 10);
		Ingredient coffee 	= new Ingredient("coffee", 30);
		//TODO boullion will have 6 units.
		
		Product blackCoffee = new Product("Black coffee", 5, cup, coffee, water, null, null);
		Product blackSweetCoffee = new Product("Black Sweet coffee", 5, cup, coffee, sugar, water, null);
		Product whiteCoffee = new Product("Milk coffee", 5, cup, coffee, water, milk, null);
		Product whiteSweetCoffee = new Product("Milk Sweet coffee", 5, cup, coffee, sugar, water, milk);
		Product latteCoffee = new Product("Latte coffee", 5, cup, coffee, sugar, milk, milk);
		
		dispenser.add(blackCoffee);
		dispenser.add(blackSweetCoffee);
		dispenser.add(whiteCoffee);
		dispenser.add(whiteSweetCoffee);
		dispenser.add(latteCoffee);
	}
	
	public void run() throws IOException {
		String option;
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			System.out.println("Press // I - Insert, S - Select, R - Return, Q - Quit");
			option = bufferRead.readLine();
			if (option.equalsIgnoreCase("Q")) {
				break;
			}
			if (option.equalsIgnoreCase("R")) {
				if (amount>0) {
					System.out.println();
					System.out.println("Returning amount " + amount);
					System.out.println();
					amount = 0;
				}
			}
			if (option.equalsIgnoreCase("I")) {
				System.out.println("Enter the amount :");
				option = bufferRead.readLine();
				try {
					amount += Integer.parseInt(option);
					System.out.println("Your current balance is: " + amount);
					System.out.println();
				} catch (Exception e) {
					System.out.println("Invalid amount entered");
					System.out.println();
				}
			}
			if (option.equalsIgnoreCase("S")) {
				System.out.println("Select your choice:");
				System.out.println("1 Black Coffee, 2 Black Sweet Coffee, 3 White Coffee, 4 White Sweet Coffee, 5 Latte");
				//TODO System.out.println("1 Black Coffee, 2 Black Sweet Coffee, 3 White Coffee, 4 White Sweet Coffee, 5 Latte, 6 Boullion");
				
				option = bufferRead.readLine();
				try {
					System.out.println();
					Product product = dispenser.get(Integer.parseInt(option)-1);
					if (product.getCost()>amount) {
						System.out.println();
						System.out.println("You don't have enough balance.");
						System.out.println();
						continue;
					}
					if (product.isAvailable()) {
						product.dispense();
						amount -= product.getCost();
						if (amount>0) {
							System.out.println();
							System.out.println("Returning amount " + amount);
							System.out.println();
							amount = 0;
						}
					} else {
						System.out.println("All ingredients not available for selected product.");
					}
					System.out.println();
				} catch (Exception e) {
					System.out.println();
					System.out.println("Invalid choice");
					System.out.println();
				}
			}
		}
	}
}
