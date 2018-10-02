import java.util.Scanner;
public class Ejercicio6 {
  public static void main(String[] args) {
    
   Scanner s = new Scanner(System.in);
    
   int altura;
   int base;
   
   System.out.println("Introduzca la altura de un triángulo");
   altura = Integer.parseInt(s.nextLine());
   
   System.out.println("Introduzca la base de un triángulo");
   base = Integer.parseInt(s.nextLine());
   
   int area = (base * altura)/ 2;
   
   System.out.println("El área de un triángulo es: " + area);
    
    
    
    
  }
}

