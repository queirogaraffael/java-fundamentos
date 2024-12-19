/*  package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;

	public Product() {

	}

	public Product(string name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double TotalValueInStock() {
		return price * quantity;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void AddProducts(int quantity) {
		this.quantity += quantity;

	}

	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;

	}

	public String toString() {
		return name + ", $" + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", TotalValueInStock());
	}

}


import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		
		Product product = new Product(name, price);

		System.out.println("Product data: " + product);

		System.out.println("Enter the number of products to be added in stock: ");
		int added = sc.nextInt();
		product.AddProducts(added);

		System.out.println("Updated data: " + product);

		System.out.println("Enter the number of products to be removed from stock: ");
		int remove = sc.nextInt();
		product.RemoveProducts(remove);

		System.out.printf("Updated data: " + product);

		sc.close();

	}
}*/