
public class StaticKeyword {

	static int a = 0;
	int b = 0;
	 static StaticKeyword s = new StaticKeyword() ;
	public StaticKeyword(){
		a+=1;
		System.out.println(a);
	}
	
	static{
		System.out.println("static block");
	}
	
	static{
		System.out.println("static block1");
	}
	
	public void nonstaticMethod(){
		System.out.println("nonstaticMethod calling static var: "+ a);
		System.out.println("nonstaticMethod calling nonstatic var: "+ b);
		System.out.println("static method called");
		
		/*staticMethod();
		System.out.println();*/
	}
	
	public static void staticMethod(){
		//StaticKeyword s = new StaticKeyword() ;
		s.nonstaticMethod();
		
		System.out.println("Static: "+ a);
		// cannot use nonstatic var like this ->System.out.println("non-Static: "+ b);
		// first static flow will occur by jvm at time obj creation will not be done 
		//and so jvm has no idea about nonstatic var
		System.out.println("nonStatic: "+ s.b);
	}
	
	public static void main(String[] args) {
		StaticKeyword s1 = new StaticKeyword();
		staticMethod();
		s1.nonstaticMethod();
		StaticKeyword s2 = new StaticKeyword();
		StaticKeyword s3 = new StaticKeyword();
		staticMethod();
		s3.nonstaticMethod();
	}

}
