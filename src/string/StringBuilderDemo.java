package string;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("Java");
		System.out.println(s);
		s.append(" Developer");
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println(s.getClass());   //class java.lang.StringBuilder
		System.out.println(s.length());
		System.out.println(s.reverse());
		System.out.println(s.hashCode());
	}
}
