import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Quantos elementos vai ter o vetor? ");

    int n = sc.nextInt();
    double[] vect = new double[n];

    for(int i = 0; i < n; i++){
      System.out.println("Digite um numero: ");
      vect[i] = sc.nextDouble();
    }

    double soma = 0.0;
    
    for(int i = 0; i < n; i++){
      soma += vect[i];
    }

    double media = soma / n;

    System.out.printf("MEDIA DO VETOR = %.3f%n", media);
    System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");

     for(int i = 0; i < n; i++){
      if(vect[i] < media){
        System.out.printf("%.1f%n", vect[i]);
      }
    }

    sc.close();  
  }
}