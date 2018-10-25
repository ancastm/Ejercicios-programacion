import java.util.Scanner;

/**Realice un programa que presente por pantalla una lista de números enteros 
 * consecutivos en orden creciente, desde el 0 en adelante. El programa pedirá
 * la cantidad de números que se van a mostrar.
 * Ejemplo: introduzca la cantidad de números: 7
 * 1-2-3-4-5-6-7
 */

public class Ejercicio1 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Este programa muestra una lista de números enteros consecutivos");
    System.out.print("Introduzca un número entero: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());
    
    for(int i = 1; i <= numeroIntroducido; i++) {
      System.out.print(i + "- ");
    }  
    
    
    
    
  }
}
 
 
