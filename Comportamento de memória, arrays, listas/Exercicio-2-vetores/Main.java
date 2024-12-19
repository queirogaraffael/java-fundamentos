import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Quantos numeros voce vai digitar ?");
    int N = sc.nextInt();

    double[] vect = new double[N];

    for(int i = 0; i < N; i++){
      System.out.println("Digite um numero: ");
      vect[i] = sc.nextDouble();
    }

    double soma = soma(vect);
    double media = soma / N ;

    System.out.print("VALORES = ");
    for(int i = 0; i < N; i++){
      System.out.printf("%.1f ", vect[i]);
    }

    System.out.println();
    System.out.printf("SOMA = %.2f%n", soma);
    System.out.printf("MEDIA = %.2f", media);
  }

  public static double soma(double[] vect){
    double total = 0;

    for (int i = 0; i < vect.length; i++){
      total += vect[i];
    }
  
    return total;
  }
}