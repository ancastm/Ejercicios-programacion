
package ejercicio5bis;

import java.util.Scanner;

/**Este programa realiza una figura a partir de un número introducido
 * por teclado
 *
 * @author Anabel Castejón Martínez
 */
public class Ejercicio5bis {

    public static void main(String[] args) {
    
      Scanner s = new Scanner(System.in);
      
      System.out.println("Este programa pinta una figura a partir de un número"+
        " introducido por teclado");
      System.out.print("Introduce un número: ");
      int numeroIntroducido = Integer.parseInt(s.nextLine());
      
      int contadorEspacio = 1;
      int aumentaNumero = 1;
      
      for (int i =1; i <= numeroIntroducido; i++) {
        System.out.println();
        for (int j = 1; j <= contadorEspacio; j++) {
          System.out.print(" ");
        }
        for (int x = 1; x <=aumentaNumero; x++) {
          System.out.print(x);
        }
        contadorEspacio++;
        aumentaNumero++;
      }
      System.out.println();
  }
  
}
