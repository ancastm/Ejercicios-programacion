/**Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los
 * cinco primeros números enteros a partir de un número introducido por teclado
 */
import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args) {
    
   Scanner s = new Scanner(System.in);
   
   System.out.print("Introduzca un número: ");
   int numeroIntroducido = Integer.parseInt(s.nextLine());
   
  for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
   System.out.printf("%4d %6d %8d\n" ,i,i*i,i*i*i);
  } 
    
    
    
    
  }
}



