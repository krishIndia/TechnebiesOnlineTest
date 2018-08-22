package test.nets.a4;

/**
 * @author Varesh
 * 
 * NO MODIFICATION TO BE DONE IN THIS CLASS
 * 
 */
public interface Crossword {
	public int getRows();

	public int getColumns();

	public Square getSquare (int row, int column);

	public void setSquareValue(int row, int column, Character value);

	public void setSquareEditable(int row, int column, boolean writable);

	public int setClueIndex();
}
