package test.nets.a5;

import java.util.Arrays;
import java.util.Random;

import junit.framework.TestCase;

public class WhoGetsDrunkFirstTestCase extends TestCase{
	
	private Contestant jonny = new Contestant("jonny", 80.0);
	private Contestant ronny = new Contestant("ronny", 75.0);
	private Contestant jenny = new Contestant("jenny", 65.0);
	
	private static final double ACCEPTABLE_DELTA = 0.01d;
	
	public void testRonnyGetsDrunkFirst(){
		Dice dice = new RandomDice(0);
		Contestant drunkFirst = new WhoGetsDrunkFirst(dice).playUntilFirstContestantIsDrunk(jonny, ronny);
		assertEquals(ronny, drunkFirst);
	}
	
	public void testProbabilities(){
		WhoGetsDrunkFirst whoGetsDrunkFirst = new WhoGetsDrunkFirst(new RandomDice());
		compare(whoGetsDrunkFirst.calculateProbabilities(jonny, ronny, jenny), 0.08, 0.22, 0.77);
		compare(whoGetsDrunkFirst.calculateProbabilities(jonny, ronny), 0.35, 0.65);
	}
	
	public void compare(double[] calculated, double... expected){
		assertNotNull("expected an array of calculated probabilities", calculated);
		assertNotNull("you have to provide some expected values");
		for(int i=0; i<calculated.length; i++){
			assertEquals("Too large gap between calculated values[" + Arrays.toString(calculated) + 
					"] and expected values [" + Arrays.toString(expected) + "] at index " + i, 
					expected[i], calculated[i], ACCEPTABLE_DELTA);
		}
	}
	
}
