import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Digite seu nome: ");
    String nome = sc.nextLine();

    System.out.println("Escolha como você gostaria de ser chamado(a): ");
    System.out.println("Nome - 1");
    System.out.println("Sobrenome - 2");
    int numero = sc.nextInt();
    
    System.out.print("Ano de nascimento: ");
    int data = sc.nextInt();

    String called = printar(nome, numero);
    String partido = probabilidade(data);
  
    System.out.println("Sr. " + called +", você tem uma grande chance de ser do partido " + partido);
    
  }

  public static String printar (String nome, int a){
    String[] nomeDividido = nome.split(" ");
    String[] word1 = nomeDividido[a-1].split("");
    String nomeFinal = word1[0].toUpperCase();

    int tamanho = nomeDividido[a-1].length();
    int i = 1;

    while(i<tamanho){
      nomeFinal += word1[i];
      i += 1;
    }
    return nomeFinal;
  
  }

  public static String probabilidade(int data){
    String partido = "democrata.";

    if (data < 1995){
      partido = "republicano.";
    }
    
    return partido;
  }
  
}