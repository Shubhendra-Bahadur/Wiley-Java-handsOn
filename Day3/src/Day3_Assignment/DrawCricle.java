package Day3_Assignment;

import java.util.Scanner;

public class DrawCricle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double radius = s.nextDouble();
		Circle circle = new Circle(radius);
		circle.calculateArea();
		System.out.println("area of circle with provided radius is: " + String.format("%.2f", circle.getArea()));
		s.close();
	}
}
