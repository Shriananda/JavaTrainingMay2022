package thiskeyword;

public class ThisAsObjArg {

	public ThisAsObjArg(){
		System.out.println("cons is invoked");
	}
	
	void m(ThisAsObjArg obj) {
		System.out.println("method is invoked");
	}

	void p() {
		m(this);
	}

	public static void main(String[] args) {
		ThisAsObjArg s1 = new ThisAsObjArg();
		s1.p();

	}

}
