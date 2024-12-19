/*

import entities.Rectangle;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter rectangle width and height: ");

		Rectangle x = new Rectangle();

		x.a = sc.nextDouble();
		x.b = sc.nextDouble();

		double area = x.Area();
		double perimeter = x.Perimeter();
		double diagonal = x.Diagonal();

		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PERIMETER = %.2f%n", perimeter);
		System.out.printf("DIAGONAL = %.2f%n", diagonal);

		sc.close();
	}
}



package entities;

public class Rectangle {

	public double a;
	public double b;

	public double Area() {
		return b * a;

	}

	public double Perimeter() {
		return a * 2 + b * 2;

	}

	public double Diagonal() {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}

}

*/