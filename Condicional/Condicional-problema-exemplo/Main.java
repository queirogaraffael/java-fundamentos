import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner valor = new Scanner(System.in);

    Double minutos, conta;

    minutos = valor.nextDouble();

    if (minutos <= 100){
      System.out.println("Valor a pagar: R$ 50.00");
    }
    else{
      conta = 50 + (minutos - 100) * 2;
      System.out.printf("Valor a pagar: R$ %.2f", conta);
    }

    valor.close();
  }
}