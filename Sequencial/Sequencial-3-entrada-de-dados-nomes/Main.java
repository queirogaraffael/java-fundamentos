import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner nome = new Scanner(System.in);

    String nome1, nome2, nome3;

    nome1 = nome.nextLine();
    nome2 = nome.nextLine();
    nome3 = nome.nextLine();

    System.out.println();
    System.out.println("Nomes: ");

    System.out.printf("%s %s %s",nome1,nome2,nome3);
    
    nome.close();

  }
}