import java.util.Locale;
import java.util.Scanner;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.println("Enter the number of tax payers: ");
		int number = sc.nextInt();

		for (int i = 1; i <= number; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.println("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Anual income: ");
			Double anualInCome = sc.nextDouble();

			if (ch == 'i') {
				System.out.println("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualInCome, healthExpenditures));
			} else {
				System.out.println("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualInCome, numberOfEmployees));
			}
		}

		System.out.println();
		System.out.println("TAXES PAID:");

		Double TotalTaxes = 0.0;

		for (TaxPayer lista : list) {
			System.out.println(lista.getName() + ": $ " + String.format("%.2f", lista.Tax()));
			TotalTaxes += lista.Tax();
		}

		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", TotalTaxes));

		sc.close();
	}
}
