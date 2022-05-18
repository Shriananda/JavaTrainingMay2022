package abstractClass;

public class MainClass {

public static void main(String args[]){
		
		Shape circle = new Circle();
		Shape triangle = new Triangle();
		
		//abstract class cannot have object 
		//Shape shape = new Shape();
		
		circle.display();
		triangle.display();
		System.out.println("****");
		Shape.staticMethod() ;
	}

}
