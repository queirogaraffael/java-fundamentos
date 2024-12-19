package entities;

public class Dados {

	private double altura;
	private char genero;

	public Dados(double altura, char genero) {
		this.altura = altura;
		this.genero = genero;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

}

/*
 
 import java.util.Scanner;
import entities.Dados;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		Dados[] dados = new Dados[n];

		for (int i = 1; i <= n; i++) {
			System.out.printf("Altura da %da pessoa: ", i);
			double altura = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i);
			char genero = sc.next().charAt(0);

			dados[i - 1] = new Dados(altura, genero);

		}

		int indiceMenorAltura = MenorAltura(dados);
		int indiceMaiorAltura = MaiorAltura(dados);

		System.out.printf("Menor altura = %.2f%n", dados[indiceMenorAltura].getAltura());
		System.out.printf("Maior altura = %.2f%n", dados[indiceMaiorAltura].getAltura());

		double mediaAlturaMulheres = MediaAlturaMulheres(dados);

		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaMulheres);

		int quantidadeDeHomens = Quantidade(dados);

		System.out.printf("Numero de homens = %d", quantidadeDeHomens);

		sc.close();
	}

	public static int MenorAltura(Dados[] vect) {
		double menorValor = vect[0].getAltura();
		int indice = 0;

		for (int i = 1; i < vect.length; i++) {
			if (menorValor > vect[i].getAltura()) {
				menorValor = vect[i].getAltura();
				indice = i;
			}
		}
		return indice;
	}

	public static int MaiorAltura(Dados[] vect) {
		double maiorValor = vect[0].getAltura();
		int indice = 0;

		for (int i = 1; i < vect.length; i++) {
			if (maiorValor < vect[i].getAltura()) {
				maiorValor = vect[i].getAltura();
				indice = i;
			}

		}
		return indice;
	}

	public static double MediaAlturaMulheres(Dados[] dados) {
		double soma = 0;
		double divisor = 0;

		for (int i = 0; i < dados.length; i++) {
			if (dados[i].getGenero() == 'F') {
				soma += dados[i].getAltura();
				divisor += 1;
			}

		}
		return soma / divisor;

	}

	public static int Quantidade(Dados[] dados) {
		int quantidade = 0;

		for (int i = 0; i < dados.length; i++) {
			if (dados[i].getGenero() == 'M') {
				quantidade += 1;
			}
		}
		return quantidade;
	}

}
*/