package test.nets.a6;

/**
 * @author Varesh
 * 
 * You need to modify this class
 */
public class LaserController {
	private Laser laser = new LaserImpl();
	
	public void moveTo(int x, int y) {
		laser.moveTo(x, y);
	}
	
	public void lineTo(int x, int y) {
		laser.beanOn();
		laser.moveTo(x, y);
		laser.beanOff();
	}
	
	public void reset() {
		laser.moveTo(0, 0);
	}
}
