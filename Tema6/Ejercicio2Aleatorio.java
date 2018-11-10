
package ejercicio2aleatorio;

/**Realiza el programa que muestre al azar el nombre de una carta de la
 * baraja francesa. Esta baraja está dividida en 4 palos: picas, corazones,
 * diamantes, tréboles. Cada palo está formado por 13 cartas, 9 numerales y 4
 * literales: 2,3,4,5,6,7,8,9,10 y J,Q K,A (sería el 1). Para convertir un número
 * a cadena de caracteres se usaría String.valueOf(n).
 *
 * @author Anabel Castejón Martínez
 */
public class Ejercicio2Aleatorio {

  public static void main(String[] args) {
    
    System.out.println("Este programa genera al azar el nombre de una carta"
      + " de la baraja francesa.");
    System.out.println("Picas, corazones, diamantes o tŕeboles:");
    
    int nombreCarta = (int)(Math.random()*4);
    String paloCarta = "";
    
    switch(nombreCarta) {
      case 0: 
        paloCarta = "Picas";
        break;
      case 1: 
        paloCarta = "Corazones";
        break;
      case 2:
        paloCarta = "Diamantes";
        break;
      case 3:
        paloCarta = "Tréboles";
        break;
      default:
        
    }
    int numeroCarta = (int)(Math.random()*13 + 1);
    String carta = "";
    
    switch(numeroCarta) {
      case 1:
        carta = "As";
        break;
      case 11:
        carta = "K";
        break;
      case 12:
        carta = "Q";
        break;
      case 13:
        carta = "J";
        break;
      default:
        
        carta = String.valueOf(numeroCarta);
        
        System.out.println(carta + " de " + paloCarta);
    }    
    System.out.println();
    
  }
  
}
