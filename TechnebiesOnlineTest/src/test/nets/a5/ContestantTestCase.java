package test.nets.a5;

import junit.framework.TestCase;

public class ContestantTestCase extends TestCase{
	
	private Contestant jonny = new Contestant("jonny", 80.0);
	private Contestant ronny = new Contestant("ronny", 75.0);
	
	public void testDrinkAndIsDrunk(){
		
		drink(42, jonny);
		drink(39, ronny);
		assertFalse(jonny.isDrunk());
		assertFalse(ronny.isDrunk());
		jonny.drink();
		ronny.drink();
		assertTrue(jonny.isDrunk());
		assertTrue(ronny.isDrunk());
		
	}
	
	public void testDrinkAndReset(){
		
		drink(43, jonny);
		assertTrue(jonny.isDrunk());
		jonny.reset();
		assertFalse(jonny.isDrunk());
		drink(42, jonny);
		assertFalse(jonny.isDrunk());
		jonny.drink();
		assertTrue(jonny.isDrunk());
		
	}
	
	private void drink(int numberOfDrinks, Contestant contestant){
		for(int i=0; i<numberOfDrinks; i++){
			contestant.drink();
		}
	}

}
