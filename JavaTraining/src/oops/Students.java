package oops;

public class Students {

	public Students(){
		System.out.println("Hi, I am inside constructor");
	}
	
	int rollnum ;
	String name ;
	//Constructor Overloading
	public Students(int i, String n){
		rollnum = i ;
		name = n;
	}
	
	public void display(){
		System.out.println("Roll num is : "+rollnum);
		System.out.println("name is : "+name);
	}
	
	public static void main(String[] args) {
		
		Students students = new Students();
		Students students1 = new Students(10,"karthic");
		Students students2 = new Students(20,"pooja");
		students1.display();
		students2.display();
		students.display();
	}

}
