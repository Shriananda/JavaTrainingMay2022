package collectionsPackage;


import java.util.LinkedList;


public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList l1 = new LinkedList();	
		l1.add(12) ;
		l1.add(100) ;
		l1.add("JAVA") ;
		l1.add("Tutorial") ;
		l1.add(123) ;
		l1.add(98) ;
		l1.add(56) ;
		
		System.out.println(l1);
		l1.addFirst("Shriananda");
		System.out.println(l1);
		l1.addLast("Padmas");
		System.out.println(l1);
	}

}
