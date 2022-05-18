package oops;

public class Dog {	
		
	String name = "Jacky";
	String breed = "BullDog";
	int height = 4;
	
	public void barking(){
		System.out.println(name+ " is barking");
	}
	
	public void eating(){
		System.out.println(name+ "is eating");
	}
	
	public static void main(String[] args) {
		Dog dogClass = new Dog();
		Dog obj2 = new Dog();
		System.out.println(dogClass.breed);
		dogClass.barking();
		obj2.barking();
	}

}
