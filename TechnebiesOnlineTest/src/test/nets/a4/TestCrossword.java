/**
 * 
 */
package test.nets.a4;

/**
 * Test class, 
 * 
 * <PRE>
 * <B>History:</B>
 * Developer         Date       	Change Reason	  	Change
 * ----------------- ---------- 	----------------- 	----------------------------------------------
 * TCS			     Apr 2, 2012     	Initial version		Release 1.0
 * </PRE>
 * 
 * @author Varesh
 * 
 * NO MODIFICATION TO BE DONE IN THIS CLASS
 */
public class TestCrossword {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CrosswordImpl c = new CrosswordImpl(9,9);
		c.setSquareEditable(0, 5, false);
		c.setSquareEditable(1, 4, false);
		c.setSquareEditable(1, 8, false);
		c.setSquareEditable(2, 7, false);
		c.setSquareEditable(2, 3, false);
		c.setSquareEditable(3, 2, false);
		c.setSquareEditable(4, 1, false);
		
		c.setSquareEditable(5, 5, false);
		c.setSquareEditable(6, 3, false);
		c.setSquareEditable(8, 4, false);
		
		c.setSquareValue(8, 5, 'D');
		c.setSquareValue(8, 6, 'U');
		c.setSquareValue(8, 7, 'K');
		c.setSquareValue(8, 8, 'E');
		
		c.setClueIndex();
		Square s = null;
		String bar = "---------------------------------------------";
		System.out.println(bar);
		for (int row=0;row<c.getRows(); row++) {
			for (int col=0; col<c.getColumns(); col++) {
				s = c.getSquare(row, col);
				if (s.isCellWritable()) {
					String cell="[";
					if (s.getClueIndex() != null) {
						cell = cell + s.getClueIndex();
						if (s.getClueIndex() <10) {
							cell = cell + " ";
						}
					} else {
						cell = cell + "  ";
					}
					if (s.getValue() != null) {
						cell = cell + s.getValue();
					} else {
						cell = cell + " ";
					}
					cell = cell + "]";
					System.out.print(cell);
				} else {
					System.out.print("[XXX]");
				}
			}
			System.out.println("");
		}
		System.out.println(bar);
	}

}
