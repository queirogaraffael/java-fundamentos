import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Quantos elementos vai ter o vetor? ");
    int n = sc.nextInt();

    int[] vect = new int[n];

    double soma = 0.0;
    int quantidade = 0;
    
    for(int i = 0; i < n; i++){
      vect[i] = sc.nextInt();
      if (vect[i]%2 == 0){
        soma += vect[i];
        quantidade += 1;
      }
    }

    if(soma == 0.0){
      System.out.println("NENHUM NUMERO PAR");
    }
    else{
      double media = soma / quantidade;
      System.out.printf("MEDIA DOS PARES = %.1f", media);
    }

    
    

    
  
    
  }
}