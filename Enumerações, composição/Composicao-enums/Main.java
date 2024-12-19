import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Level: ");
		String level = sc.nextLine();
		System.out.println("Base salary: ");
		Double salary = sc.nextDouble();

		Worker worker = new Worker(name, WorkerLevel.valueOf(level), salary, new Department(departmentName));

		System.out.println("How many contracts to this worker? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.println("Date (DD/MM/YYYY): ");
			Date date = sdf.parse(sc.next());
			System.out.println("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			System.out.println("Duration (hours): ");
			Integer hour = sc.nextInt();

			worker.addContract(new HourContract(date, valuePerHour, hour));
		}
		
		System.out.println();

		System.out.println("Enter month and year to calculate income (MM/YYYY): ");
		String dateIncome = sc.next();

		int month = Integer.parseInt(dateIncome.substring(0, 2));
		int year = Integer.parseInt(dateIncome.substring(3));

		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + dateIncome + ":" + String.format(" %.2f", worker.income(month, year)));

		sc.close();
	}
}