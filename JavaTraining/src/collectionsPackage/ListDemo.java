package collectionsPackage;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List l1 = new ArrayList();		
		l1.add(0, 12);
		l1.add(1, 14);		
		System.out.println(l1);
		List l2 = new ArrayList();	
		l2.add(10);
		l2.add(11);
		l2.add(121);
		l2.add(131);
		l2.add(141);
		l2.add(141);
		
		l1.addAll(0, l2);
		System.out.println("Add l1 in 0th index: "+l1);
		
		l1.remove(3);
		System.out.println("remove 3rd element: "+l1);
		
		System.out.println("Index 5th: "+ l1.get(5));		
		System.out.println("Index of element 121: "+l1.indexOf(121));
		System.out.println("Last Index of element 141: "+l1.lastIndexOf(141));
		
		List l3 = new ArrayList();
		l3 = l1.subList(0, 3) ;
		System.out.println("List l3: "+l3);
	}

}
