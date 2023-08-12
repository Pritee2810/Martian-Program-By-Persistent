package collectionsAndMaps;

import java.util.HashSet;
import java.util.Iterator;

public class HSet {
	public static void main(String args[]) {
		HashSet hs= new HashSet();
		hs.add(1);
		hs.add(1);
		hs.add(4);
		hs.add(3);
		hs.add(5);
		hs.add(2);
		System.out.println(hs);          //will print in sorted order
		Iterator it = hs.iterator();
		
		while(it.hasNext()) {
			int i = (Integer) it.next();
			System.out.println(i);
		}
	}
	
}
