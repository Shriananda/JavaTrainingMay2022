package oops1;

public class X3 extends BMW{
	 
	static String model ="X3";
	public static void main(String args[]){
		BMW bmw = new BMW();
		//System.out.print(name+" ");
		System.out.print(bmw.name+" ");
		bmw.run();
		Car car = new Car();
		System.out.println(model+" ");
		car.run();
	}

}
