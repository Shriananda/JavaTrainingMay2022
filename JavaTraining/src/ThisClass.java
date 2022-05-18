
public class ThisClass {
 
	int roll;
	String name;
	int age;
	
	public ThisClass(int roll, String name, int age) {
		this.roll = roll;
		this.name = name;
		this.age = age ;
	}
	
	public ThisClass(){
		this(20, "padmashri", 46) ;
	}
	
	public void display() {
		System.out.println("Roll number: "+roll);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("this keyword");
		this.display1();
	}
	
	public void display1() {
		System.out.println("Roll number: "+roll);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	
	public static void main(String[] args) {

		ThisClass c = new ThisClass(10, "shri", 31) ;
		ThisClass c1 = new ThisClass() ;
		c.display();
		c1.display();
	}

}
