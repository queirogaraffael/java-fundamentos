import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Quantas repetições ? ");
    int i = sc.nextInt();
    
    
    for (int i = 4 ; i>0 ;i--){
      System.out.println("Escolha um caractere: ");
      char caractere =  sc.next().charAt(0);
      System.out.println("Esse foi o caractere: " + caractere);

      
      
    }

    sc.close();
  }
}