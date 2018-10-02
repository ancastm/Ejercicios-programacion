import java.util.Scanner;
public class Ejercicio5 {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  
  int base;
  int altura;  
 
  
  System.out.println("Introduzca la base de un rectángulo");
  base = Integer.parseInt(s.nextLine());
  
  System.out.println("Introduzca la altura de un rectángulo");
  altura = Integer.parseInt(s.nextLine());
  
  int area = base * altura;
  
  System.out.println("El área de un rectángulo es: " + area);
    
    
  }
}

