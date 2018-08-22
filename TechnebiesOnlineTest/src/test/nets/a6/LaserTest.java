package test.nets.a6;

/**
 * @author Varesh
 * 
 * NO MODIFICATIONS TO BE DONE IN THIS CLASS
 * 
 */
public class LaserTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LaserController controller = new LaserController();
		
		controller.moveTo(10, 10);
		controller.lineTo(10, 20);
		controller.lineTo(20, 20);
		controller.lineTo(20, 10);
		controller.lineTo(10, 10);
		
		controller.moveTo(10, 15);
		controller.lineTo(10, 10);
		controller.reset();
	}

}
