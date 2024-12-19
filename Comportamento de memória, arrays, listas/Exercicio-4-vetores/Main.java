import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Quantos numeros voce vai digitar? ");
    int N = sc.nextInt();

    int[] vect = new int[N];

    for (int i = 0; i < N; i++){
      System.out.println("Digite um numero: ");
      vect[i] = sc.nextInt();
    }

    int quantidade = 0;
    
    System.out.println("NUMEROS PARES: ");

    for (int i = 0; i < N; i++){
      if ((vect[i] % 2) == 0){
          System.out.printf("%d  ",vect[i]);
          quantidade += 1;
      }
    }

    System.out.printf("%nQUANTIDADE DE PARES = %d", quantidade);
    
    sc.close();
  }
}

// 8 2 11 14 13 20