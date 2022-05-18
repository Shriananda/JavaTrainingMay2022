
public class EncapsulationClass {

	private int roll;
	private String name;
	private int age;
	
	
	
	public int getRoll() {
		return roll;
	}



	public void setRoll(int roll) {
		this.roll = roll;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}

	public void display() {
		System.out.println("Roll number: "+getRoll());
		System.out.println("Name: "+getName());
		System.out.println("Age: "+getAge());
		
	}

	public static void main(String[] args) {
		EncapsulationClass e = new EncapsulationClass();
		e.setRoll(10);
		e.setName("Shri");
		e.setAge(31);
		EncapsulationClass e1 = new EncapsulationClass();
		e1.setRoll(10);
		e1.setName("Padmashri");
		e1.setAge(46);
		e.display();
		e1.display();
	}

}
