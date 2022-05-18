package collectionsPackage;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();

		for (int i = 0; i < 10; i++) {
			v.addElement(i);
		}
		System.out.println(v);
		
		Enumeration<Integer> e = v.elements();
		
		while (e.hasMoreElements()) {
			int integer = (Integer) e.nextElement();
			System.out.print(integer+" ");
			
		}
		
	}

}
