import java.util.Scanner;
import java.util.Locale;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Shape> list = new ArrayList<>();

		System.out.println("Enter the number of shapes: ");
		int numberOfShapes = sc.nextInt();

		for (int i = 1; i <= numberOfShapes; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.println("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.println("Color (BLACK/BLUE/RED): ");
			sc.nextLine();
			String color = sc.nextLine();

			if (ch == 'r') {
				System.out.println("Width: ");
				Double width = sc.nextDouble();
				System.out.println("Height: ");
				Double height = sc.nextDouble();
				list.add(new Rectangle(Color.valueOf(color), width, height));

			} else {
				System.out.println("Radius: ");
				Double radius = sc.nextDouble();
				list.add(new Circle(Color.valueOf(color), radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS: ");

		for (Shape elemento : list) {
			System.out.printf("%.2f%n", elemento.Area());
		}

		sc.close();
	}
}
