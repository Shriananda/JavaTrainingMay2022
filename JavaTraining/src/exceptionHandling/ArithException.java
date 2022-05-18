package exceptionHandling;

import encapsualation.BankLoan;

public class ArithException {

	public static void main(String args[])
	{
		try{
			int value = 100;		
			int result = value /0 ;		
			System.out.println(result);
		}catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
			System.out.println("Please use another value to divide the integer");
		}
		System.out.println("statement after catch block");
		
	}
}
