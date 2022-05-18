package javaBean;

public class Test {
	public static void main(String args[]) {
		Employee e = new Employee();// object is created
		e.setName("Arjun");// setting value to the object
		e.setId(10);
		System.out.println(e.getName());
		System.out.println(e.getId());
	}
}
