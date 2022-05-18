package collectionsPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayToArrayList {

	public static void main(String[] args) {
		int a[] = { 33, 3, 4, 5 };
		System.out.println("Printing original array:");
		ArrayList al = new ArrayList() ;
	
		for (int i : a){
			System.out.println(i);
			al.add(i) ;
		}
			
		System.out.println(al);
		Object[] a1 = al.toArray();
		System.out.println("he");
		for (Object o : a1) {
			System.out.println(o);
		}
	
		String aaa[] = {"a","b"} ;
		ArrayList ab = new ArrayList(Arrays.asList(aaa)) ;
		System.out.println(ab);
		
		// working for string array only
		ArrayList aba = new ArrayList(Arrays.asList(a)) ;
		System.out.println(aba);
	}

}
