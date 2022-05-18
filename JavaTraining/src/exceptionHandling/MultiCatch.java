package exceptionHandling;

public class MultiCatch {

	public static void main(String[] args) {
		
		try{
			int value = 100;		
			int result = value /0 ;		

			String text = null;
			System.out.println(text.length());
		}catch(ArithmeticException e){
			System.out.println("Declared specific exception");
			e.printStackTrace();
		}catch(Exception e){
			System.out.println("Declared generic exception");
			e.printStackTrace();
		}
		/*String text = null;
		System.out.println(text.length());*/
		//only one catch block will be executed per try block

	}

}
