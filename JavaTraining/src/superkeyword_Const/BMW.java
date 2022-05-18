package superkeyword_Const;

public class BMW extends Car{

	
	 public BMW(){
		 //super();
		 System.out.println("Calling BMW constructor");
	 }
	
	 public BMW(int a){
		 //super();
		// super(a);
		 System.out.println("BMW param constructor: "+a);
		
	 }
	 
	
	public static void main(String args[]){
		BMW bmw = new BMW();		
		
	}
	
}
