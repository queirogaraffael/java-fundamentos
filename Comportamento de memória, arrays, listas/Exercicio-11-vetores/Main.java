package entities;

public class Older {

	private String name;
	private int age;

	public Older(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

/*
 import java.util.Scanner;
import entities.Older;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();

		Older[] older = new Older[n];

		for (int i = 1; i <= n; i++) {
			System.out.printf("Dados da %da pessoa: %n", i);
			System.out.println("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Idade: ");
			int age = sc.nextInt();
			older[i - 1] = new Older(name, age);
		}

		int indice = Indice(older);

		System.out.printf("PESSOA MAIS VELHA: %s", older[indice].getName());

		sc.close();

	}

	public static int Indice(Older[] vect) {
		int maiorIdade = vect[0].getAge();
		int indice = 0;

		for (int i = 1; i < vect.length; i++) {
			if (maiorIdade < vect[i].getAge()) {
				maiorIdade = vect[i].getAge();
				indice = i;
			}
		}
		return indice;
	}

}

*/