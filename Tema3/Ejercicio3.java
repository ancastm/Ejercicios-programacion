import java.util.Scanner;
public class Ejercicio3 {
  public static void main(String[] args) {
    
  Scanner s = new Scanner(System.in);
  
  int pesetas;
  System.out.println("Introduzca una cantidad en pesetas que se convertirán en euros");
  pesetas = Integer.parseInt(s.nextLine());
  double euros = (double) (pesetas / 166.386);
  
  System.out.println(pesetas + " pesetas son " + euros + " euros");
    
    
    
    
  }
}

