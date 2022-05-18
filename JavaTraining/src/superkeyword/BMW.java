package superkeyword;

public class BMW extends Car{

	 String name = "BMW" ;
	 
	 public BMW(){
		 //super();
		 System.out.println("Calling BMW constructor");
	 }
	
	 public BMW(int a){
		 //super();
		 System.out.println("BMW param constructor: "+a);
	 }
	 
	 public void getName() {
		System.out.println(name);
		System.out.println(super.name);
	}
	 
	/* public static void getName1() {
		 BMW car1 = new BMW();
			System.out.println(car1.name);
		}*/
	 
	 public void run() {
			System.out.println("BMW is running - sub class");
			super.run();
		}
	
	public static void main(String args[]){
		BMW bmw = new BMW();
		System.out.print(bmw.name+" ");
		bmw.run();
		//getName1();
		bmw.getName();
	}
	
}
