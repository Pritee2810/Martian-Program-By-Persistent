package exceptionHandling;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PassingException {
	static void converDateFormat(String inputDate) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date date = sdf.parse(inputDate);
			SimpleDateFormat outputsdf = new SimpleDateFormat("yyyy-MM-dd");
			String outputDate = outputsdf.format(date);
			System.out.println("After changing the date format to yyyy/MM/dd: "+ outputDate);
		}catch(java.text.ParseException e) {
			System.out.println("Some error occoured during converting date format");
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter date in format dd/MM/yyyy: ");
		String inputDate = scanner.nextLine();
		converDateFormat(inputDate);
	}
}
