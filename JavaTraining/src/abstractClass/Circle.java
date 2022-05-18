package abstractClass;

public class Circle extends Shape {

	@Override
	public void display() {
		System.out.println("shape is circle");	
		System.out.println("a= "+a);
		a=10;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		b=15;
		System.out.println("b= "+b);
		
		System.out.println("c= "+c);
		staticMethod();
	}
	
	
	
	/*public static void main(String args[]){
		
		Shape s = new Circle();
		Shape s1 = new Triangle();
				
		s.display();
		s1.display();
	}*/

}
