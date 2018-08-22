package test.nets.a2;

/**
 * @author 
 *
 */
public class GeometricCalculator {
	
	public double getArea(Shape shape, double... parameters) {
		double area = 0.0d;
		
		if (shape == null) {
			throw new IllegalArgumentException();
		}
		
		if ("RECTANGLE".equals(shape.toString())) {
			if (parameters == null || parameters[0] <= 0.0 || parameters[1] <= 0.0) {
				throw new IllegalArgumentException();
			} else {
				area = parameters[0] * parameters[1]; 
			}
		} else if ("SQUARE".equals(shape.toString())) {
			if (parameters == null || parameters[0] <= 0.0) {
				throw new IllegalArgumentException();
			} else {
				area = parameters[0] * parameters[0];
			}
		} else if ("CIRCLE".equals(shape.toString())) {
			if (parameters == null || parameters[0] <= 0.0) {
				throw new IllegalArgumentException();
			} else {
				area = Math.PI * parameters[0] * parameters[0];
			}
		} else {
			throw new IllegalArgumentException();
		}
		
		return area;
	}
	
	public double getCircumference(Shape shape, double... parameters) {
		double circumference = 0.0d;
		
		if (shape == null) {
			throw new IllegalArgumentException();
		}
		
		if ("RECTANGLE".equals(shape.toString())) {
			if (parameters == null || parameters[0] <= 0.0 || parameters[1] <= 0.0) {
				throw new IllegalArgumentException();
			} else {
				circumference = parameters[0] + parameters[1] + parameters[0] * parameters[1]; 
			}
		} else if ("SQUARE".equals(shape.toString())) {
			if (parameters == null || parameters[0] <= 0.0) {
				throw new IllegalArgumentException();
			} else {
				circumference = parameters[0] + parameters[0] + parameters[0] + parameters[0];
			}
		} else if ("CIRCLE".equals(shape.toString())) {
			if (parameters == null || parameters[0] <= 0.0) {
				throw new IllegalArgumentException();
			} else {
				circumference = 2 * Math.PI * parameters[0];
			}
		} else {
			throw new IllegalArgumentException();
		}
		
		return circumference;
	}
}
