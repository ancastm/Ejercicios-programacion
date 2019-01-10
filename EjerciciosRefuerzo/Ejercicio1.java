/*Realice un programa que maneje un array de enteros cuyo
 * tamaño se le indique al usuario, para almacenar tantos
 * enteros como se le hayan reservado. Muéstrelos en pantalla
 * en orden inverso al que se han introducido. Sólo puede 
 * utilizar un array.
 *
 * @author Anabel Castejón Martínez
 */
 public class Ejercicio1 {
  public static void main(String[] args) {
    
    int [] arrayEnteros = new int [5];
    System.out.println("Introduzca 5 números enteros y los" +
    " mostraré en orden inverso: ");
    
    for (int i = 0; i<arrayEnteros.length;i++) {
      arrayEnteros [i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println();
    
    //Darle la vuelta al array
    for (int i = arrayEnteros.length -1; i>=0; i--) {
      System.out.println(arrayEnteros[i] + " ");
      }
  
  }
}
