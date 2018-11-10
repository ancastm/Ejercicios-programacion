
package ejercicio4aleatorio;

/**Muestra 20 números aleatorios entre 0 y 10 ambos incluidos, separados
 * por espacios.
 *
 * @author Anabel Castejón Martínez
 */
public class Ejercicio4Aleatorio {
 
  public static void main(String[] args) {
    
   
    for (int i = 1; i<=20; i++) {
      System.out.print ((int) (Math.random() * 10) + " " );
    }
    System.out.println();
  }
  
}
