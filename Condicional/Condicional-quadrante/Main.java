import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner ponto = new Scanner(System.in);

    Double x, y;
    String quadrante;

    x = ponto.nextDouble();
    y = ponto.nextDouble();

    if (x>0 && y>0){
      quadrante = "Q1";
    }
    else if(x>0 && y<0){
      quadrante = "Q4";
    }
    else if(x<0 && y>0){
      quadrante = "Q2";
    }
    else if(x<0 && y<0){
      quadrante = "Q3";
    }
    else{
      quadrante = "Origem";
    }

    System.out.println(quadrante);
    
    ponto.close();
    
  }
}