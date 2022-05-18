package abstractClass;

public class Triangle extends Shape {

	@Override
	public void display() {
		System.out.println("shape is triangle");
		System.out.println("a= "+a);
		a=15;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		System.out.println("c= "+c);
		staticMethod();
	}

}
