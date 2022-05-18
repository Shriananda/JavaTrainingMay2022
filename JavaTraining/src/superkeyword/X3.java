package superkeyword;

public class X3 extends BMW{
	 
	static String model ="X3";
	//static String name ="X3";
	
	public X3(){
		 //super();
		 System.out.println("Calling X3 constructor");
	 }
	
	public X3(int a){
		super(a);
		 System.out.println("param constructor: "+a);
	 }
	
	/*public void run() {
			System.out.println("X3 is running");
			super.run();
		}*/
	
	public static void main(String args[]){
		X3 x3 = new X3();
		System.out.print(x3.name+" ");
		x3.run();
		System.out.println("***********************************");
		Car car = new Car();
		System.out.println(model+" ");		
		car.run();
		System.out.println("*************param cons**************");
		X3 x31 = new X3(5);
		
	}

}
