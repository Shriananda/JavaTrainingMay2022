package collectionsPackage;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet<>();
		
		ts.add(123) ;
		ts.add(887) ;
		ts.add(34) ;
		ts.add(111) ;
		ts.add(654) ;
		ts.add(123) ;
		//ts.add("anand") ;		
		System.out.println(ts);
		
		ts.remove(111) ;
		System.out.println(ts);
		
		System.out.println(ts.contains(34));
		
		System.out.println("First element is: "+ts.first());
		System.out.println("Last element is: "+ts.last());
		
		System.out.println("Use of HeadSet: "+ts.headSet(654));
		System.out.println("Use of HeadSet with inclusive: "+ts.headSet(654, true));
		
		System.out.println("Use of TailSet: "+ts.tailSet(654));
		System.out.println("Use of TailSet: "+ts.tailSet(654, false));
		
		System.out.println("Use of SubSet: "+ts.subSet(34, 654));
		System.out.println("Use of SubSet: "+ts.subSet(34, true, 654, true));
		
		
		ts.clear();
		System.out.println(ts);
		
	}

}
