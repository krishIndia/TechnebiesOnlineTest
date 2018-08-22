package test.nets.a6;

/**
 * @author Varesh
 * NO MODIFICATION TO BE DONE IN THIS CLASS
 */
public class LaserImpl implements Laser {

	@Override
	public void moveTo(int x, int y) {
		System.out.println("Move To :[" + x + "," + y +"]");
	}

	@Override
	public void beanOn() {
		System.out.println("Bean On");
	}

	@Override
	public void beanOff() {
		System.out.println("Bean Off");
	}

}
