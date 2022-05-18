
public class VarDataTypes {

	//static variable can be accessed using static method only
	static int staticVar = 1234;
	//class variable can be accessed using non-static method only
	int classVar1 = 12341;
	static float f ;
	static double d ;
	public static void firstMethod() {
		//local variables
		int number = 12345;
		String city = "New york" ;
		boolean flag = true ;
		char character ='a';
		 f =3123223f;
		 d =312.14D;
		long phone = 8056834892L ;
		
		System.out.println("*******firstMethod*******");
		System.out.println(number);
		System.out.println(city);
		System.out.println(flag);
		System.out.println(f);
		System.out.println(d);
		//class var not allowed in static method as shown in below commented line
		//System.out.println(classVar1);
		
		//instance variable or class variable
		System.out.println(staticVar);
	}
	
	public void secondMethod() {
		System.out.println("*******secondMethod*******");
		//instance variable or class variable
		System.out.println(staticVar);
		System.out.println(classVar1);
		System.out.println(f);
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		
		VarDataTypes.firstMethod();
		
		//local variable cannot be called from different method
		//System.out.println(number);
		System.out.println("*******Main method*******");
		//instance variable or class variable
		System.out.println(staticVar);
		VarDataTypes v = new VarDataTypes();
		v.secondMethod();
		
	}

}
