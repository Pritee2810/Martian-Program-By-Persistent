package math;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		System.out.println();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy   hh:mm:ss"); //mm for minute, DD for the day of year
		String s = sdf.format(d);
		System.out.println(s);
	}
}
