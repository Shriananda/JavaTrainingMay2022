package exceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		try{
			String name = "Shri" ;
			System.out.println(name);
			
			String text = null;
			System.out.println(text.length());
		}catch(Exception e){
			System.out.println("Declared generic exception");
			e.printStackTrace();
		}
		finally{
			System.out.println("I am inside finally block");
		}
	}

}
