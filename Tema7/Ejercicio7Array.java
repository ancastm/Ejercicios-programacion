
package ejercicio7array;

import java.util.Scanner;

/**Escribe un programa que genere 100 números aleatorios del 0 al 20 y
 * que los muestre por pantalla separados por espacios. El programa 
 * pedirá por teclado dos valores y a continuación cambiará todas las ocurrencias
 * del primer valor por el segundo en la lista generada anteriormente. Los 
 * números que se han cambiado deben aparecer entrecomillados.
 *
 * @author Anabel Castejón Martínez
 */
public class Ejercicio7Array {

   public static void main(String[] args) {
    
     Scanner s = new Scanner(System.in);
     
     int[] numeros = new int[100];
     //generar el array con 100 números aleatorios
     for (int i = 0; i < 100; i++) {
       numeros[i] = (int) (Math.random() * 21);
       System.out.print(numeros[i] + " ");
     }
     //Pedir por teclado los dos valores
     System.out.println("\nIntroduce un valor de los que se han generado: ");
     int primerValor = Integer.parseInt(s.nextLine());
     
     System.out.println("Introduce un segundo valor para sustituir el anterior: ");
     int segundoValor = Integer.parseInt(s.nextLine());
     
     //Cambiar ocurrencias del primer valor por el segundo
     for (int i = 0; i<100 ;i++) {
       if (numeros[i] == primerValor) {
         numeros[i] = segundoValor;
         System.out.print("\"" + numeros[i] + "\" ");
       }
       }
       
     }
  }
  

