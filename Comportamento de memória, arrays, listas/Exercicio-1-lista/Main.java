import java.util.Scanner;
//import java.util.List; //interface
import java.util.ArrayList; // classe que implementa a interface List

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {
			System.out.println("Informe o " + i + ".o valor: ");
			Integer valor = sc.nextInt();
			list.add(valor);

		}

		System.out.println("Conteúdo do ArrayList: ");

		for (Integer elemento : list) {
			System.out.println(elemento);
		}

		sc.close();

	}

}
