/* 
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee x = new Employee();

		System.out.println("Name: ");
		x.name = sc.nextLine();
		System.out.println("Gross salary: ");
		x.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		x.tax = sc.nextDouble();

		System.out.printf("Employee : %s, $ %.2f%n", x.name, x.NetSalary());

		System.out.println("Which percentage to increase salary ?");

		double percentage = sc.nextDouble();
		x.IncreaseSalary(percentage);

		System.out.printf("Updated data: %s, $ %.2f", x.name, x.NetSalary());

		sc.close();

	}
}
*/

/*

package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;

	public double NetSalary() {
		return grossSalary - tax;
	}

	public void IncreaseSalary(double porcentage) {
		this.grossSalary = (grossSalary * ((porcentage + 100) / 100));

	}

}


*/