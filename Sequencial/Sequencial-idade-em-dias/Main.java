import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

      Scanner valor = new Scanner(System.in);

      int dias, ano, mes;

      dias = valor.nextInt();

      ano = dias / 365 ;

      dias -= ano*365;

      mes = dias/30;

      dias -= mes*30;

      System.out.printf("%d ano(s)%n",ano);
      System.out.printf("%d mes(es)%n",mes);
      System.out.printf("%d dia(s)%n",dias);

      valor.close();
        
    }
 
}