package test.nets.a3;

public class Ingredient {
	String name;
	int quantity;
	
	public Ingredient(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public boolean dispense() {
		if (quantity >1) {
			System.out.println("Dispensing " + getName());
			quantity--;
			return true;
		} else {
			System.out.println(name + " finished.");
			return false;
		}
	}
}
