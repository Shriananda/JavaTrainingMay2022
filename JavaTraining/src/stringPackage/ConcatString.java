package stringPackage;

public class ConcatString {

	public static void main(String[] args) {
		String name = "Anand" ;
		String name1 = "padhu" ;
		
		String finalStr = name+" "+name1;
		System.out.println(finalStr);
		
		String finalStr1 ;
		finalStr1 = name.concat(" ").concat(name1);
		
		
		System.out.println(finalStr1);
		
		
	}

}
