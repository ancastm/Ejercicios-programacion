
package ejercicio6aleatorio;

import java.util.Scanner;

/**Escribe un programa que piense un número al azar entre 0 y 100. El 
 * usuario debe adivinarlo y tiene para ello 5 oportunidades. Después de cada
 * intento fallido, el programa dirá cuántas oportunidades le queda y si el 
 * número introducido es menor o mayor que el número secreto.
 *
 * @author Anabel Castejón Martínez
 */
public class Ejercicio6Aleatorio {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int oportunidades = 5;
    int numeroIntroducido;
    int numeroSecreto = (int)(Math.random() * 101);
    boolean acertado = false;
    
    System.out.println("Este programa piensa un número al azar entre 0 y 100 "
      + ". El usuario debe adivinarlo, para ello tiene 5 oportunidades");
    
    do {
      System.out.println("Introduce un número: ");
      numeroIntroducido = Integer.parseInt(s.nextLine());
      oportunidades--;
      //comparar numero introducido si es mayor que el secreto
      if ((numeroIntroducido > numeroSecreto) && (oportunidades >0)) {
        System.out.println("El número secreto es menor que " + numeroIntroducido);
        System.out.println("Te quedan " + oportunidades + " oportunidades.");
      }
      if ((numeroIntroducido < numeroSecreto) && (oportunidades > 0)) {
        System.out.println("El número secreto es mayor a " + numeroIntroducido);
        System.out.println("Te quedan " + oportunidades + " oportunidades.");
      }
      if (numeroIntroducido==0) {
        System.out.println("Enhorabuena!!, Has acertado");
      }
      
    }while(!acertado && oportunidades>0);
    
    if (!acertado) {
      System.out.println("Lo siento has fallado, el número secreto es: " + numeroSecreto);
    }
  }
}  
