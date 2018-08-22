package test.nets.a5;

/**
 * NEED IMPLEMENTATION
 */
public class DrinkingGame {
	private Dice dice;
	private Contestant[] contestants;
	
	public DrinkingGame(Dice dice, Contestant... contestants) {
		
		if (contestants == null || contestants.length <= 1) {
			throw new IllegalArgumentException("Need to provide atleast two contestants");
		}
		
		this.dice = dice;
		this.contestants = contestants;
	}
	
	/**
	 * TODO Implement this method
	 * 
	 * @return
	 */
	public Result playNextMove() {

		// IMPLEMENT YOUR CODE
		
		return null;
	}
	
}
