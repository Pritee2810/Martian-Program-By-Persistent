package string;

public class StringDemo {
	public static void main(String[] args) {
		String s1 ="Java";
		System.out.println(s1);
		s1.concat(" Developer");
		System.out.println(s1);
		String s2 = s1.concat(" Developer");
		System.out.println(s2);
		
		System.out.println(s2.length());
		System.out.println(s2.isEmpty());
		System.out.println(s2.toString());
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
		System.out.println(s2.hashCode());
	}
}
