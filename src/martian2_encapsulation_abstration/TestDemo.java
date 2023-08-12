package martian2_encapsulation_abstration;

public class TestDemo {
	public static void main(String[] args) {
		Test t = new Test();
		//t.display();   //can't access display method from Test class as it is private, can be accessed if it is default
	}
	
}
