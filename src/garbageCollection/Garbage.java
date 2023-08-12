package garbageCollection;

public class Garbage {
	public static void main(String[] args) {
		Garbage object = new Garbage();
		object = null;
		
		Garbage a = new Garbage();
		Garbage b = new Garbage();
		b = a;
		System.gc(); 
	}
	protected void finalize() throws Throwable{
		System.out.println("Garbage collection is preferred!");
	}
}
