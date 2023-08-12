package exceptionHandling;

public class SampleException {
	public static void main(String[] args) {
//		String str = null;
//		System.out.println(str.length());  //NullPointerException
		
		try {
			int a=30, b=0;
			int c=a/b;
			System.out.println("result "+c);
		}
		catch(ArithmeticException e){
			System.out.println("Can't divide number by zero");
		}
		try {
			try {
				int num = Integer.parseInt("Edureka");
				System.out.println(num);
			}
			catch(NumberFormatException e){
				System.out.println("Number format exception");
		}
		
		try {
			int a[] = new int[5];
			a[7] = 9;
		}
		catch(Exception e) {
				System.out.println("Handled");
		}
		
			System.out.println("Other statement");
		}
		catch(Exception e) {
			System.out.println("handled and recovered");
		}
	}
}
