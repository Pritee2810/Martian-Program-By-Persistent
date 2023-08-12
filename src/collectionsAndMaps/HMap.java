package collectionsAndMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HMap {

	public static void main(String[] args) {
		 //HashMap m = new HashMap();   //all enteries are treated as object   //line no 8
		 HashMap <Integer, String> m = new HashMap <Integer, String>();  //all keys are integer and all values are strings
		 m.put(101, "John");
		 m.put(102, "Devid");
		 m.put(103, "Geeta");
		 m.put(104, "Marry");
		 m.put(103, "X");
		 m.put(106, "John");
		 System.out.println(m);
		 
		 System.out.println(m.get(105));
		 System.out.println(m.get(104));
		 m.remove(103);
		 System.out.println(m);
		 
		 System.out.println(m.containsKey(101));
		 System.out.println(m.containsKey(105));
		 
		 System.out.println(m.containsValue("Marry"));
		 
		 System.out.println(m.isEmpty());
		 System.out.println(m.keySet());  //[101, 102, 104, 106]  =>return type: set
		 System.out.println(m.values());  //[John, Devid, Marry, John] =>return type: collection
		 System.out.println(m.entrySet()); //[101=John, 102=Devid, 104=Marry, 106=John] =>return type: set  =>return all pair(entry)
		 
		 
		 
		 
		 
		 for(int i:m.keySet()) {    //need to specify datatype of keys as int (line no. 9 will works)
			 System.out.println(i);  //101
                                     //102
			                         //104
			                         //106
		 }
		 for(String i:m.values()) {    //need to specify datatype of values as String (line no. 9 will works)
			 System.out.println(i);  
		 }
		 for(Object i:m.keySet()) {    //need to specify datatype of values as Object (line no. 8, 9 will works)
			 System.out.println(i);  
		 }
		 for(Object i:m.values()) {    //need to specify datatype of values as Object (line no. 8,9 will works)
			 System.out.println(i);  
		 }
		 
		 for(Object i:m.keySet()) {    
			 System.out.println(i+ "         "+m.get(i));  
		 }
		 
		 
		 
		 
		 //Entry method
		 for(Map.Entry entry:m.entrySet()) {
			 System.out.println(entry.getKey()+"       "+entry.getValue());
		 }
		 
		 
		 
		 
		 //iterator()
		 Set s = m.entrySet();
		 Iterator itr= s.iterator();
		 while(itr.hasNext()) {
			 Map.Entry entry = (Entry) itr.next();
			 System.out.println(entry.getKey()+"     "+entry.getValue());
		 }
	
	
	}

}
