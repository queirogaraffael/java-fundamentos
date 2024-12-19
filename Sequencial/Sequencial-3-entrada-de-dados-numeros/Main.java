import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner valor = new Scanner(System.in);

    Float s1, s2, s3;

    s1 = valor.nextFloat();
    s2 = valor.nextFloat();
    s3 = valor.nextFloat();

    System.out.println();

    System.out.println("Valores lidos:");
    System.out.printf("%.2f %.2f %.2f",s1,s2,s3);

    valor.close();
      
  }
}
