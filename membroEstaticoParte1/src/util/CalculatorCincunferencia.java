package util;

public class CalculatorCincunferencia {
	
	public static final double PI = 3.14159;

	
	public static double circumference(double radius) {
		return (2.0*PI*radius);
	}
	
	public static double volume(double radius) {
		return (4.0/3.0*PI*Math.pow(radius, 3));
	}
}
