package polymorphism_Overloading;

public class ChildAddition extends Addition{

	public static void main(String[] args) {
		
		Addition add = new Addition();
		add.addValues(11, 11);
		add.addValues(11, 11,11);
		
		double d = add.addValues(11.11, 12.12);
		System.out.println(d);
	}

}
