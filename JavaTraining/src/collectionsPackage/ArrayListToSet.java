package collectionsPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListToSet {

	public static void main(String[] args) {
		ArrayList al = new ArrayList() ;
		al.add(2);
		al.add(5);
		al.add(24);
		al.add(10);
		al.add(10);
		al.add(7) ;
		Set s = new HashSet();
		for (int i = 0; i < al.size(); i++) {
			s.add(al.get(i));
		}
		System.out.println(s);
		
		HashSet s1 = new HashSet(al);
		System.out.println(s1);
		
		TreeSet s2 = new TreeSet(al);
		System.out.println(s2);
		
		Set s3 = new TreeSet(al);
		System.out.println(s3);
		
		LinkedHashSet s4 = new LinkedHashSet(al);
		System.out.println(s4);
		
		//sorting list
		Collections.sort(al);
		System.out.println(al);
	}

}
