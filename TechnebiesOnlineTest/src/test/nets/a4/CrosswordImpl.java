package test.nets.a4;

/**
 * <<Add class description here>><br><br>
 * 
 * <PRE>
 * <B>History:</B>
 * Developer         Date       	Change Reason	  	Change
 * ----------------- ---------- 	----------------- 	----------------------------------------------
 * TCS			     Apr 2, 2012     	Initial version		Release 1.0
 * </PRE>
 * 
 * @author Varesh
 */
public class CrosswordImpl implements Crossword {
	
	public CrosswordImpl(int row, int column) {
		//TODO Implement this
	}
	
	public int getRows() {
		//TODO Implement this
		return 0;
	}
	
	public int getColumns() {
		//TODO Implement this
		return 0;
	}
	
	public Square getSquare (int row, int column) {
		//TODO Implement this
		return null;
	}
	
	/**
	 *TODO 
	 *Row and Column will start from 0 to total-1 (java standards)
	 * 
	 */
	public void setSquareValue(int row, int column, Character value) {
		//TODO Implement this
	}
	
	/**
	 * Any change to this will result in a different clue index.
	 * This should not call the update index and its 
	 * upto the calling program to update the clue index.
	 * 
	 */
	public void setSquareEditable(int row, int column, boolean writable) {
		//TODO Implement this
	}
	
	/**
	 * TODO: clue index is the number provided to a cell for clue index.
	 * Rules are:
	 * 1. The index should be incremental
	 * 2. A cell can have a index if its the start of a word. 
	 * The minimum length should be 2 cells.
	 * 
	 * The method should return the last index assigned to the square.
	 * 
	 * e.g. for a 4*4 puzzle, the clue index will be as follows
	 * XX are square blocks where you can not 
	 * [1 ][2 ][  ][3 ]
	 * [4 ][  ][XX][  ]
	 * [  ][XX][5 ][  ]
	 * [6 ][  ][  ][  ]
	 */
	public int setClueIndex() {
		//TODO Implement this
		return 0;
	}
	
}
