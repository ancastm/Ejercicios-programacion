
package ejercicio8array;

import java.util.Scanner;

/**Realiza un programa que pida la temperatura media que ha hecho en cada
 * mes de un determinado año y que muestre a continuación un diagrama
 * de barras horizontales con esos datos. Las barras del diagrama se pueden
 * dibujar a base de asteriscos o cualquier otro carácter.
 *
 * @author Anabel Castejón Martínez
 */
public class Ejercicio8Array {
  public static void main(String[] args) {
   
    Scanner s = new Scanner(System.in);
    
    String[] mes = {
      "enero","febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto",
    "septiembre", "octubre", "noviembre", "diciembre"
    };
    
    int[] temperatura = new int[12];
    
    //Pedir al usuario la temperatura media de cada mes.
    for (int i=0; i<12;i++) {
      System.out.println("Introduzca la temperatura media " + mes[i] + ": " );
      temperatura[i] = Integer.parseInt(s.nextLine());
    }
    System.out.println("El diagrama generado es: ");
    
    for (int i = 0; i<12; i++) {
      System.out.println(mes[i]);
      for (int j = 0; j< temperatura[i]; j++) {
        System.out.print(" * ");
      }
      System.out.println(temperatura[i] + "ºC");
    }
    
    System.out.println();
    
    
    
  }
  
}
