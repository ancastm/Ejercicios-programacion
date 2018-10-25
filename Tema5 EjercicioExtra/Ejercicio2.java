/**Realice un programa que presente una lista de números enteros consecutivos
 * en orden creciente. El programa pedirá la cantidad de números que se van a 
 * mostrar y a partir de qué número.
 */
 
import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Este programa muestra una lista de números consecutivos");
    System.out.print("Introduzca la cantidad de números ");
    int numero = Integer.parseInt(s.nextLine());
    
    System.out.print("Introduzca el primer número: ");
    int primerNumero = Integer.parseInt(s.nextLine());
    
    for (int i = 0; i < numero; i++) {
      System.out.print(primerNumero + i + "-");
    }  
    
  }  
}    
 
