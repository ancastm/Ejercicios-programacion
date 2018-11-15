
package ejercicio9array;

import java.util.Scanner;

/**Realiza un programa que pida 8 números enteros y que luego muestre
 * esos números junto con la palabra "impar", "par" según proceda.
 *
 * @author Anabel Castejón Martínez
 */
public class Ejercicio9Array {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int[] numeros = new int[8];
    
    System.out.println("Este programa muestra números seguido de si es par o "
      + "impar");
    for (int i = 0; i<8; i++) {
      System.out.print("Introduce 8 números enteros y pulse INTRO: \n");
      numeros[i] = Integer.parseInt(s.nextLine());
      
        if (numeros[i] % 2 == 0) {
          System.out.print("Par");
        }else{
          System.out.println("Impar");
      }
    }
    System.out.println();
  }
  
}
