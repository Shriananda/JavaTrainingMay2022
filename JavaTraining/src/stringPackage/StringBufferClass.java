package stringPackage;

public class StringBufferClass {

	public static void main(String[] args) {
		//string is immutable
		String name = "Anand" ;
		name.concat(" padhu");
		System.out.println(name);
		
		//StringBuffer is mutable
		System.out.println();
		System.out.println("append method");
		StringBuffer sb = new StringBuffer("Anand") ;
		sb.append(" padhu") ;		
		System.out.println(sb);
		
		System.out.println();
		System.out.println("Insert method");
		sb.insert(4, "insertedValue") ;
		System.out.println(sb);
		
		System.out.println();
		StringBuffer sb1 = new StringBuffer("Anand") ;
		System.out.println("replace method");
		sb1.replace(2, 4, "replaced") ;
		System.out.println(sb1);
		
		System.out.println();
		StringBuffer sb2 = new StringBuffer("Anand") ;
		System.out.println("delete method");
		sb2.delete(2, 4) ;
		System.out.println(sb2);
		
		
		System.out.println();
		StringBuffer sb3 = new StringBuffer("Anand") ;
		System.out.println("reverse method");
		sb3.reverse();
		System.out.println(sb3);
		
	}

}
