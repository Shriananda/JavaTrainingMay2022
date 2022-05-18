
public class NonStatic {

	 int a = 0;
	
	public NonStatic(){
		a+=1;
		System.out.println(a);
	}
	
	public static void staticMethod(){
		//error
		//System.out.println("Static: "+ a);
	}
	
	public void nonstaticMethod(){
		System.out.println("nonstaticMethod: "+ a);
	}
	
	
	public static void main(String[] args) {
		NonStatic ns1 = new NonStatic();
		NonStatic ns2 = new NonStatic();
		NonStatic ns3 = new NonStatic();
	}

}
