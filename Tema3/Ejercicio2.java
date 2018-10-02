import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    
  Scanner s = new Scanner(System.in);
  
  double euros;
  System.out.println("Introduzca una cantidad en euros que se convertirán en pesetas");
  euros = Double.parseDouble(s.nextLine());
  int pesetas = (int) (euros * 166.386);
  
  System.out.println(euros + " euros son " + pesetas + " pesetas");
    
    
    
  }
}

