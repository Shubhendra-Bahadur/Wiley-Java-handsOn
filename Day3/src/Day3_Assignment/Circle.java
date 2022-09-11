package Day3_Assignment;

public class Circle {
	private double radius, area;

	public Circle(double radius) {
		this.radius = radius;
	}

	public void calculateArea() {
		area = 3.14 * radius * radius;
	}
	
	public double getArea() {
		return area;
	}
}
