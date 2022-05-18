package abstractClass;

public abstract class Shape {

	int a = 5;
	static int b = 6;
	final int c = 0;

	public abstract void display();

	public void displayName() {
		int d = 5;
		System.out.println("from Shape Class");
	}

	public static void staticMethod() {
		int e = 5;
		System.out.println("from Shape Class static method");
	}

	public Shape() {
		System.out.println("Shape abs class Constructor");
	}

	public static void main(String args[]) {
		System.out.println("abs class main method");
		Shape circle = new Circle();
		Shape triangle = new Triangle();

		// abstract class cannot have object
		// Shape shape = new Shape();

		circle.display();
		triangle.display();
		System.out.println("****");
		Shape.staticMethod();
	}

	/*
	 * Important Points About Abstract Class: An abstract class must be declared
	 * with an abstract keyword. It can have abstract and non-abstract methods.
	 * It cannot be instantiated. It can have constructors and static methods
	 * also. In Abstract Class, at least one methods should be abstract.
	 */

}
