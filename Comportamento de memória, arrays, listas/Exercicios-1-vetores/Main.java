import  java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Quantos numeros voce vai digitar? ");
    int N = sc.nextInt();

    int[] vect = new int[N];

    for (int i = 0; i < N; i++){
      System.out.println("Digite um número: ");
      vect[i] = sc.nextInt();
    }

    System.out.println("NUMEROS NEGATIVOS:");
    
    for(int obj : vect){
      if (obj < 0){
        System.out.println(obj);
      }
    }
  }
}