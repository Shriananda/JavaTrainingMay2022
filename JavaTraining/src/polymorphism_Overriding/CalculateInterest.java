package polymorphism_Overriding;

public class CalculateInterest {

	public static void main(String[] args) {
		
		AmericanExpress am = new AmericanExpress();
		BankOfAmerica boa = new BankOfAmerica();
		ICICIBank icici = new ICICIBank();
		
		System.out.println(am.getInterest());
		System.out.println(boa.getInterest());
		System.out.println(icici.getInterest());
	}

}
