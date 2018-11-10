
package ejercicio3aleatorio;

/** Igual que el ejercicio anterior pero con la baraja española. Se 
 * utilizará la baraja de 40 cartas: 2,3,4,5,6,7, sota, caballo, rey y as.
 *
 * @author Anabel Castejón Martínez
 */
public class Ejercicio3Aleatorio {

   public static void main(String[] args) {
    
     System.out.println("Este programa genera al azar cartas de la baraja"
       + " española");
     
     int nombreCarta = (int) (Math.random() * 4);
     String palo = "";
     
     switch (nombreCarta) {
       case 0:
         palo = "Espadas";
         break;
       case 1: 
         palo = "Oros";
         break;
       case 2:
         palo = "Copas";
         break;
       case 3: 
         palo = "Bastos";
         break;
       default:
         
     }
     int numeroCarta = (int) (Math.random() * 11) + 1;
     String carta = "";
     
     switch (numeroCarta) {
       case 1:
         carta = "As";
         break;
       case 8:
         carta = "sota";
         break;
       case 9:
         carta = "caballo";
         break;
       case 10:
         carta = "rey";
         break;
       default:
         
         carta = String.valueOf(numeroCarta);
         
         System.out.println(carta + " de " + palo);
     }
     
     
  }
  
}
