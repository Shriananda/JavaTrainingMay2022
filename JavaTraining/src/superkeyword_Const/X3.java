package superkeyword_Const;

public class X3 extends BMW{
	 
	
	public X3(){
		 //super();
		 System.out.println("Calling X3 constructor");
	 }
	
	public X3(int a){
		super(a);
		 System.out.println("param constructor: "+a);
	 }
	
	
	
	public static void main(String args[]){
		System.out.println("X3 class");
		X3 x3 = new X3();
		
		System.out.println("***********************************");
	//	Car car = new Car();
		
		System.out.println("*************param cons**************");
		X3 x31 = new X3(5);
		
	}

}
