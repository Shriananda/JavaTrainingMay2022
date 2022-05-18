package collectionsPackage;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Padmashri");
		hs.add("Anand");
		hs.add("Mukanthan");
		hs.add("Cini");
		hs.add("Anu");
		hs.add("Padmashri");
		
		System.out.println(hs);
		hs.clear();
		System.out.println(hs);
		
		hs.add("Padmashri");
		hs.add("Anand");
		hs.add("Mukanthan");
		hs.add("Cini");
		hs.add("Anu");
		System.out.println(hs);
		
		hs.remove("Mukanthan") ;
		System.out.println(hs);
		
		System.out.println("Is SET contain Anand: "+hs.contains("Anand"));

		Iterator i = hs.iterator();
		while (i.hasNext()) {
			String s = (String) i.next();
			System.out.println(s);
		}
		
	}

}
