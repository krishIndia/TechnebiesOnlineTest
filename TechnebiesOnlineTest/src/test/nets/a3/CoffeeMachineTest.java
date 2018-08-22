package test.nets.a3;

import java.io.IOException;

public class CoffeeMachineTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CoffeeMachine cm = new CoffeeMachine();
		cm.load();
		try {
			cm.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
