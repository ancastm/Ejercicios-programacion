
package ejercicio5array;

import java.util.Scanner;

/**Escribe un programa que pida 10 números por teclado y que luego 
 * muestre los números introducidos junto con las palabras "máximo" y 
 * "mínimo" al lado del máximo y mínimo respectivamente.
 *
 * @author Anabel Castejón Martínez
 */
public class Ejercicio5Array {

  public static void main(String[] args) {
   
    Scanner s = new Scanner(System.in);
    
    int [] numero = new int [10];
    int maximo = 0;
    int minimo = 0;
    
    for (int i = 1; i <= 10; i ++) {
      System.out.println("Introduce números y pulse INTRO: ");
      numero[i] = Integer.parseInt(s.nextLine());
      
      if (numero[i] < minimo) {
        minimo = numero[i];
      }
      if (numero[i] > maximo) {
        maximo = numero[i];
      }
    }
    
    System.out.println();
    
    for (int i = 1; i<=10; i++) {
      System.out.println(numero[i]);
      if (numero [i] == maximo) {
        System.out.print("Máximo");
      }
      if (numero[i] == minimo) {
        System.out.print("Mínimo");
      }
    }
    System.out.println();
  
  }
}
  
