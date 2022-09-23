package homework;

import java.util.Calendar;

public class Test01 {

	public static void main(String[] args) {
		int year  = 1994;
		Calendar c = Calendar.getInstance();

		int thisyear = c.get(Calendar.YEAR);
		int age = (thisyear -year)+1;
		System.out.println(age);
		System.out.println(year);
	}
}
