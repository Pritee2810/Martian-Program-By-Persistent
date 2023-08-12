package collectionsAndMaps;

import java.util.ArrayList;

public class Collections {
	public static void main(String args[]) {
		ArrayList <String> al = new ArrayList<String>();
		al.add("Pavas");
		al.add("Charan");
		al.add("Sameer");
		al.add("Java");
		al.add("Rohit");
		
		System.out.println(al);
		for(String str:al) {
			System.out.println("Welcome "+str);
		}
		al.remove("Rohit");
		al.remove(2);
		al.remove("Charan");
		System.out.println(al);
		
		al.add(1, "Collection");
		System.out.println(al);

	}
}
