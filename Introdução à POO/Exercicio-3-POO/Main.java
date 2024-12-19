/*

import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student x = new Student();

		x.nome = sc.nextLine();
		x.grade1 = sc.nextDouble();
		x.grade2 = sc.nextDouble();
		x.grade3 = sc.nextDouble();

		System.out.printf("FINAL GRADE = %.2f%n", x.Nota());

		if (x.PassOrFailed()) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", x.Missing());
		}

		sc.close();

	}
}
*/

/*
package entities;

public class Student {

	public String nome;
	public double grade1;
	public double grade2;
	public double grade3;

	public double notaFinal = 0;

	public double Nota() {
		this.notaFinal = grade1 + grade2 + grade3;
		return notaFinal;
	}

	public boolean PassOrFailed() {
		if (notaFinal >= 60) {
			return true;
		} else {
			return false;
		}
	}

	public double Missing() {
		return 60 - notaFinal;
	}

}

*/
