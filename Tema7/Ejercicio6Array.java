
package ejercicio6array;

import java.util.Scanner;

/**Escribe un programa que lea 15 números por teclado y que los almacene 
 * en un array. Rota los elementos de ese array, es decir, el elemento de la
 * posición 0 debe pasar a la posición 1, el de la 1 a la 2, etc. El número que
 * se encuentra en la última posición pasaría a la posición 0. Finalmente, muestra
 * el contenido del array.
 *
 * @author Anabel Castejón Martínez
 */
public class Ejercicio6Array {

   public static void main(String[] args) {
    
     Scanner s = new Scanner(System.in);
     
     int [] numeros = new int[15]; //creamos el array de 15 elementos
     int ultimaPosicion;
     
     System.out.println("A continuacion se rellena el array: ");
     for (int i = 0; i < 15; i++) {
       System.out.print(i + " Introduce 15 números: ");
       numeros[i] = Integer.parseInt(s.nextLine());
     }
     ultimaPosicion = numeros[14];//Guardamos el ultimo elemento para no perderlo
     
     System.out.println();
     
     for (int i = 13; i >= 0; i--) {//Los elementos avanzan una posicion
       numeros[i+1] = numeros[i];
     }
     numeros[0] = ultimaPosicion; //La posicion ultima pasa a ser la primera
     
     System.out.println("\nEl nuevo array es: ");
     for (int i = 0; i<15;i++) {
       System.out.println(i + " Es el: " + numeros[i]);
     }
     
  }
  
}
