import java.util.Scanner;
public class Dowhile {
	private static Scanner scanner;
		public static void main(String[] args) {
			scanner = new Scanner(System.in);
			int value=0;
			do {
				System.out.print("Enter a no:");
				value= scanner.nextInt();
			}while(value!=5);
			System.out.println("Got 5!!!");
		}
}
