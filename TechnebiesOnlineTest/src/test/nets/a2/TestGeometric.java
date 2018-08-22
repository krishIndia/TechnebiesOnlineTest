package test.nets.a2;

/**
 * @author Varesh
 *
 * NO MODIFICATIONS TO BE DONE IN THIS CLASS
 */
public class TestGeometric {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GeometricCalculator gc = new GeometricCalculator();
		System.out.println("Area of 3*4 Rectangle is " + gc.getArea(Shape.RECTANGLE, 3.0,4.0));
		System.out.println("Circumference of Circle with radius 4 is " + gc.getCircumference(Shape.CIRCLE, 4.0));
	}

}
