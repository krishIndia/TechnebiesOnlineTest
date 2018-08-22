package test.nets.a5;

import java.util.Random;

/**
 * NO MODIFICATION IS ALLOWED
 * 
 */
public class RandomDice implements Dice {
	
	private Random random;
	
	public RandomDice(){
		random = new Random();
	}
	
	public RandomDice(long randomSeed){
		random = new Random(randomSeed);
	}

	@Override
	public int rollDice() {
		return random.nextInt(6) + 1;
	}

}
