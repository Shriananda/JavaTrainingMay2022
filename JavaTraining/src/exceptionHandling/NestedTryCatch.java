package exceptionHandling;

public class NestedTryCatch {

	public static void main(String[] args) {

		try{
			System.out.println("First try block");
			String text = null;
			System.out.println(text.length());
			
			try{
				System.out.println("Second try block");
				int value = 100;		
				int result = value /0 ;	
				
				try{
					System.out.println("Third try block");
					int[] arr = new int[3];
					arr[5] = 100;
				}catch(Exception e){
					System.out.println("End of Third try block");
					e.printStackTrace();
				}
				
			}catch(Exception e){
				System.out.println("End of Second try block");
				e.printStackTrace();
			}
		}catch(Exception e){
			System.out.println("End of First try block");
			e.printStackTrace();
		}

	}

}
