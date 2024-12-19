import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Date d1 = Date.from(Instant.parse("2022-12-28T18:37:00Z"));
		Date d2 = sdf.parse(sc.next());

		System.out.println(sdf.format(d2));

		Calendar cal = Calendar.getInstance();
		cal.setTime(d2);
		
		// cal.add(Calendar.HOUR_OF_DAY, 4);
		// d = cal.getTime();
		
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);

		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);

		sc.close();

	}
}
