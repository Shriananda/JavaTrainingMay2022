package collectionsPackage;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();	
		l1.add(12) ;
		l1.add(100) ;
		l1.add("JAVA") ;
		l1.add("Tutorial") ;
		l1.add(123) ;
		l1.add(98) ;
		l1.add(56) ;
		
		System.out.println(l1);
		
		l1.remove(4);
		System.out.println(l1);
		
		System.out.println(l1.get(2));
		
	}

}
