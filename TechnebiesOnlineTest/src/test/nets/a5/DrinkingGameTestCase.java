package test.nets.a5;

import junit.framework.TestCase;

/**
 * CAN EXTEND THIS TEST CASES
 *
 */
public class DrinkingGameTestCase extends TestCase{
	
	private static final Contestant JONNY = new Contestant("Jonny", 80.0);
	private static final Contestant RONNY = new Contestant("Ronny", 75.0);
	
	public void testLoseFast(){
		
		Dice dice = new RiggedDice(3,4, 2,4);
		DrinkingGame drinkingGame = new DrinkingGame(dice, JONNY, RONNY);
		
		Result result = drinkingGame.playNextMove();
		assertEquals(JONNY, result.getContestant());
		assertTrue(result.isWon());
		
		result = drinkingGame.playNextMove();
		assertEquals(RONNY, result.getContestant());
		assertFalse(result.isWon());
		
	}
	
	public void testLoseLow(){
		
		Dice dice = new RiggedDice(1,2, 3,2, 3,4, 5,6, 2,4);
		DrinkingGame drinkingGame = new DrinkingGame(dice, JONNY, RONNY);
		
		Result result = drinkingGame.playNextMove();
		assertEquals(JONNY, result.getContestant());
		assertTrue(result.isWon());
		
		result = drinkingGame.playNextMove();
		assertEquals(RONNY, result.getContestant());
		assertTrue(result.isWon());
		
		result = drinkingGame.playNextMove();
		assertEquals(JONNY, result.getContestant());
		assertTrue(result.isWon());
		
		result = drinkingGame.playNextMove();
		assertEquals(RONNY, result.getContestant());
		assertTrue(result.isWon());
		
		result = drinkingGame.playNextMove();
		assertEquals(JONNY, result.getContestant());
		assertFalse(result.isWon());
		
	}
	
	public void testTurnsAfterLosing(){
		
		Dice dice = new RiggedDice(3,4, 5,6, 2,4, 1,2, 5,1, 5,2, 2,3);
		DrinkingGame drinkingGame = new DrinkingGame(dice, JONNY, RONNY);
		
		Result result = drinkingGame.playNextMove();
		assertEquals(JONNY, result.getContestant());
		assertTrue(result.isWon());
		
		result = drinkingGame.playNextMove();
		assertEquals(RONNY, result.getContestant());
		assertTrue(result.isWon());
		
		result = drinkingGame.playNextMove();
		assertEquals(JONNY, result.getContestant());
		assertFalse(result.isWon());
		
		result = drinkingGame.playNextMove();
		assertEquals(RONNY, result.getContestant());
		assertFalse(result.isWon());
		
		result = drinkingGame.playNextMove();
		assertEquals(JONNY, result.getContestant());
		assertTrue(result.isWon());
		
		result = drinkingGame.playNextMove();
		assertEquals(RONNY, result.getContestant());
		assertTrue(result.isWon());
		
		result = drinkingGame.playNextMove();
		assertEquals(JONNY, result.getContestant());
		assertFalse(result.isWon());
		
	}

}
