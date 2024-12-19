import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Produtos[] produtos = new Produtos[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double price = sc.nextDouble();

			produtos[i] = new Produtos(nome, price);
		}

		double total = 0.0;
		
		for (int i = 0; i < n; i++) {
			total += produtos[i].getPrice();
		}
		
		double average = total / n;
		
		System.out.printf("AVERAGE PRICE = %.2f", average);
		
		sc.close();
	}
}