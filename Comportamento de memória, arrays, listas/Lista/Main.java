import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {

    List<String> list = new ArrayList<>();
    
    list.add("Maria");
    list.add("Alex");
    list.add("Bob");
    list.add("Anna");
    list.add(2, "Marco");
    list.add(0,"Raffael");

    list.remove("Alex");
    list.remove("Maria");

    String nome = list.get(0);
    System.out.println();
    System.out.println(nome);

   for(String obj : list){
     System.out.println(obj);
   }
    
  }
}