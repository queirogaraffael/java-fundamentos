import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter cliente data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Email: ");
		String email = sc.next();
		System.out.println("Birth date (DD/MM/YYYY): ");
		Date date = sdf.parse(sc.next());

		System.out.println("Enter order data: ");
		System.out.println("Status: ");
		String status = sc.next();

		Order order = new Order(new Date(), OrderStatus.valueOf(status), new Client(name, email, date));

		System.out.println("How many items to this order? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.println("Product name: ");
			String productName = sc.next();
			System.out.println("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.println("Quantity: ");
			Integer quantity = sc.nextInt();

			order.addItem(new OrderItem(quantity, productPrice, new Product(productName, productPrice)));

		}

		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);

		sc.close();
	}
}