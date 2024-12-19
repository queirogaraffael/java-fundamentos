import java.util.Scanner;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.println("Enter the number of employees: ");
		int numberEmployee = sc.nextInt();

		for (int i = 1; i <= numberEmployee; i++) {
			System.out.println("Employee#" + i + " data: ");
			System.out.println("Outsourced (y/n)? ");
			sc.nextLine();
			char ch = sc.nextLine().charAt(0);
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Hours: ");
			Integer hours = sc.nextInt();
			System.out.println("Value per hour: ");
			Double valuePerHour = sc.nextDouble();

			if (ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				list.add(new Employee(name, hours, valuePerHour));

			}

		}

		System.out.println("PAYMENTS: ");

		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.Payment()));
		}

		sc.close();

	}

}