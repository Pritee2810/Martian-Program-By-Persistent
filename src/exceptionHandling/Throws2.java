package exceptionHandling;

public class Throws2 {
	static void avg() throws ArithmeticException{
		System.out.println("Inside avg function");
		throw new ArithmeticException("Demo");		
	}
	
	public static void main(String[] args) {
		try {
			avg();
		}
		finally {
			System.out.println("Caught");
		}
	}
}
