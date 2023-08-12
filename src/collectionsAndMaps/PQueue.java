package collectionsAndMaps;

import java.util.PriorityQueue;

public class PQueue {
	public static void main(String args[]) {
		PriorityQueue <Integer> pq= new PriorityQueue <Integer>();
		for(int i=10; i>0; i--) {
			pq.add(new Integer(i));
		}
		for(int i=1; i<=10; i++) {
			Integer c = pq.poll();
			System.out.println(c);
		}
	}
}
