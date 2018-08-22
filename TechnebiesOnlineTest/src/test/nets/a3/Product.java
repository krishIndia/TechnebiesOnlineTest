package test.nets.a3;

import java.util.ArrayList;
import java.util.List;

public class Product {
	String name;
	int cost;
	List<Ingredient> listIn = new ArrayList<Ingredient>();
	
	public Product(String name, int cost, Ingredient i1, Ingredient i2, Ingredient i3, Ingredient i4, Ingredient i5) {
		this.name = name;
		this.cost = cost;
		if (i1 != null) {
			listIn.add(i1);
			if (i2 != null) {
				listIn.add(i2);
				if (i3 != null) {
					listIn.add(i3);
					if (i4 != null) {
						listIn.add(i4);
						if (i5 != null) {
							listIn.add(i5);
						}
					}
				}
			}
		}
	}
	
	public void dispense() {
		System.out.println("Preparing " + name);
		for (Ingredient ing : listIn) {
			ing.dispense();
		}
		System.out.println();
		System.out.println(name + " ready.");
		System.out.println();
	}
	
	public boolean isAvailable() {
		for (Ingredient ing : listIn) {
			if (ing.getQuantity()<1) {
				return false;
			}
		}
		return true;
	}
	
	public int getCost() {
		return cost;
	}
}
