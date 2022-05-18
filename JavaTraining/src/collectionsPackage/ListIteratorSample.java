package collectionsPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorSample {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			a.add(i);
		}
		
		System.out.println(a);
		
		ListIterator<Integer> itr = a.listIterator();
		
		while (itr.hasNext()) {
			int i = (Integer) itr.next();
			
			System.out.print(i+" ");
			
			//Remove odd numbers
			if(i%2!=0){
				i++;
				itr.set(i);// set method to update
				itr.add(i);// to add the value i to list
			}
			
		}
		
		System.out.println();
		
		System.out.println("Elements in Array List after modification: "+ a);
		
	}

}
