package collectionsPackage;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap hm = new TreeMap<String, Integer>();

		hm.put("Anand", 1);
		hm.put("padhu", 1);
		hm.put("shri", 31);
		hm.put("Shri", 31);
		hm.put("ram", 11);
		hm.put("an", 21);
		hm.putIfAbsent("Anand", 1);
		System.out.println(hm);

		if (hm.containsKey("ram"))
			System.out.println("ram: " + hm.get("ram"));
		
		hm.remove("an");
		System.out.println("Size of hashmap: "+hm.size());
		System.out.println("is hashmap empty?: "+hm.isEmpty());
		hm.clear();
		System.out.println("is hashmap empty?: "+hm.isEmpty());

	}

}
