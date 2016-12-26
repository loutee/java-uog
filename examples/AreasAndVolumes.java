//AreasAndVolumes.java

/*
 * Local Variables are declared inside a method
 * Instance Variables are declared inside a class but outside a method
 * Static Variables are declared as static and cannot be local
 */

public class AreasAndVolumes {

	// Declaring a new static instance variable pi,
	// assigning it the value 3.14159

	private static final double pi = 3.14159;

	public double volumeOfSphere (double radius) {
		return (4/3) * Math.pow(pi * radius, 3);
	}

	public double volumeOfCylinder (double radius, double height) {
		return Math.pow(radius * pi, 2) * height;
	}

	public double areaOfCircle (double radius, double height) {
		return Math.pow(radius * pi, 2);
	}
}
