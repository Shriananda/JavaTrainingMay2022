package collectionsPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorSample {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			a.add(i) ;
		}
		
		System.out.println("Elements in Array List: "+ a);

		Iterator<Integer> itr = a.iterator();
		
		while (itr.hasNext()) {
			int i = (Integer) itr.next();
			
			System.out.print(i+" ");
			
			//Remove odd numbers
			if(i%2!=0){
				itr.remove();
			}
			
		}
		
		System.out.println();
		
		System.out.println("Elements in Array List: "+ a);
		
	}

}
