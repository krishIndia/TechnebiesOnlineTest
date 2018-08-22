package test.nets.a5;

/**
 * @author Varesh
 *
 * NO MODIFICATION TO BE DONE IN THIS CLASS
 */
public class Result {
	private Contestant contestant;
	private boolean won;
	
	public Result(Contestant contestant, boolean won) {
		this.contestant = contestant;
		this.won = won;
	}
	
	public Contestant getContestant() {
		return contestant;
	}
	
	public boolean isWon() {
		return won;
	}
}
