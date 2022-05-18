package stringPackage;

public class CompareString {

	public static void main(String[] args) {
		String name = "Anand" ;
		String name1 = "Anand" ;
		String name2 = "anand" ;
		
		String country = new String("United States");
		String country1 = new String("United States");
		
		System.out.println(name.equals(name1));
		System.out.println(name.equals(name2));
		
		System.out.println(name.equalsIgnoreCase(name2));
		
		System.out.println(country.equals(country1));
		
		System.out.println(country==country1);
	}

}
