package Quiz4;

//protected class AccessSpecifierDemo {}  //class cannot be protected in java
//private class AccessSpecifierDemo {}    //class cannot be private in java

//public class AccessSpecifierDemo{}      //allowed
//public class Demo{}   //only one public class allowed in one java file
//NOTE: only one public class, multiple default class, zero private and zero protected class allowed in java file
//---------------------------------------------------------------------------------------------------------


public class AccessSpecifierDemo{
	public void publicfun() {
		System.out.println("Public class - Public fun");
	}
	protected void protectedfun() {
		System.out.println("Public class - Protected fun");
	}
	void defaultfun() {
		System.out.println("Public class - default fun");
	}
	private void privatefun() {
		System.out.println("Public class - private fun");
	}
}

class AccessSpecifierTry{
	public void publicfun() {
		System.out.println("Default class - Public fun");
	}
	protected void protectedfun() {
		System.out.println("Default class - Protected fun");
	}
	void defaultfun() {
		System.out.println("Default class - default fun");
	}
	private void privatefun() {
		System.out.println("Default class - private fun");
	}
}