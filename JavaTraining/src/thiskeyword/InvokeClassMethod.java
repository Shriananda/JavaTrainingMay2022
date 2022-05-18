package thiskeyword;

public class InvokeClassMethod {

	public static void main(String[] args) {
		InvokeClassMethod a = new InvokeClassMethod();
		a.n();
	}

	void m() {
		System.out.println("hello m");
	}

	void n() {
		System.out.println("hello n");
		// m();//same as this.m()
		this.m();
	}

}
