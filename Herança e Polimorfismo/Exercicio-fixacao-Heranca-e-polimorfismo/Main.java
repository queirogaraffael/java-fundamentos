import java.util.Scanner;

import java.util.List;
import java.util.ArrayList;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.println("Common, used or imported (c/u/i)?");
			sc.nextLine();
			char ch = sc.nextLine().charAt(0);
			System.out.println("Name:");
			String name = sc.nextLine();
			System.out.println("Price:");
			Double price = sc.nextDouble();

			if (ch == 'c') {
				list.add(new Product(name, price));
			} else if (ch == 'u') {
				System.out.println("Manufacture date (DD/MM/YYYY):");
				Date date = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, date));
			} else {
				System.out.println("Customs fee: ");
				Double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}

		}

		System.out.println();
		System.out.println("PRICE TAGS:");

		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}
		sc.close();

	}
}