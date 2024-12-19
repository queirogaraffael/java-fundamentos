import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		int indice = Indice(vect);

		System.out.printf("MAIOR VALOR = %.1f%n", vect[indice]);
		System.out.printf("POSICAO DO MAIOR VALOR = %d", indice);

		sc.close();
	}

	public static int Indice(double[] vect) {
		int indice = 0;
		double maior = vect[0];

		for (int i = 1; i < vect.length; i++) {
			if (vect[i] > maior) {
				indice = i;
				maior = vect[i];
			}
		}
		return indice;
	}
}