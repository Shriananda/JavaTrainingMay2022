package finalKeyword;

public class SampleFinal {

	final int maxAge = 100;
	
	public void setAge() {
		//The final field SampleFinal.maxAge cannot be assigned
		//maxAge = 101;
	}
	
	public final void setAge1() {
		System.out.println("only final");
	}
	
	public final void setAge1(int a) {
		System.out.println("only final");
	}
	
	public static void main(String[] args) {
	

	}

}
