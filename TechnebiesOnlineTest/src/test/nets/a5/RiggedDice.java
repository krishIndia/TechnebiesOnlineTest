package test.nets.a5;

/**
 * @author Varesh
 *
 * NO MODIFICATION TO BE DONE IN THIS CLASS
 */
public class RiggedDice implements Dice {
	
	private int[] riggedDiceResults;
	private int current = 0;
	
	public RiggedDice (int ... riggedDiceResults) {
		this.riggedDiceResults = riggedDiceResults;
	}
	
	@Override
	public int rollDice() {
		if (current < riggedDiceResults.length) {
			return riggedDiceResults[current++];
		}
		throw new RuntimeException("Too many rolls of the dice, only " + riggedDiceResults.length + " rolls were provided");
	}

}
