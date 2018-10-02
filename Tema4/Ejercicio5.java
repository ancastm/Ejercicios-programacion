import java.util.Scanner;
public class Ejercicio5 {
  public static void main(String[] args) {
    
  Scanner s = new Scanner(System.in);
    
  //Realiza un programa que resuelva una ecuación de primer grado (del tipo 
  //ax + b = 0)
  
  double a;
  double b;
  System.out.println("Este programa resuelve ecuaciones de primer grado del tipo "
  + " ax + b = 0 ");
  System.out.println("Ahora introduce el valor de a: ");
  a = Double.parseDouble(s.nextLine());
  System.out.println("Ahora introduce el valor de b: ");
  b = Double.parseDouble(s.nextLine());
  
  if (a == 0) {
    System.out.println("Este programa no tiene solución real");
  } else {
    System.out.println("x = " + (-b/a));
  }
  
     
  }
}

