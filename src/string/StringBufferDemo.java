package string;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Java");
		System.out.println(s);
		s.append(" Developer");
		System.out.println(s.length());
		System.out.println(s.toString());
		System.out.println(s.reverse());  //repoleveD avaJ
		System.out.println(s);  //repoleveD avaJ
		System.out.println(s.hashCode());
		System.out.println(s.isEmpty());
	}
}
