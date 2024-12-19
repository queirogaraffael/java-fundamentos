import java.util.Scanner;
import java.util.Date;

import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

		String data = sc.nextLine();

		Date date = sdf.parse(data);

		System.out.println(date);

		sc.close();

	}

}
