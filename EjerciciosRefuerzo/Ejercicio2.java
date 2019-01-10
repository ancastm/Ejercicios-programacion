/*Modifique el programa anterior para invertir el orden
 * de los elementos en el array, y presente los elementos
 * tanto en el orden original en el que se introdujeron
 * como en el orden inverso al que se introdujeron. 
 * Puede utilizar tantos arrays como desee.
 * 
 * @author Anabel Castejón Martínez
 */
 public class Ejercicio2 {
  public static void main(String[] args) {
  
  int [] arrayEnteros = new int [5];
  System.out.println("Introduzca 5 números enteros: ");
  
  //Guardar los números en el array
  for (int i = 0; i<arrayEnteros.length; i++) {
    arrayEnteros[i] = Integer.parseInt(System.console().readLine());
    }
  //Mostrar el array en el orden inverso al que se han introducido
  System.out.println("A continuación, se muestra el array " +
  "en el orden inverso al que se ha introducido los números");
  for(int i =arrayEnteros.length-1; i>=0; i--) {
    System.out.println(arrayEnteros[i] + " ");
    }
    
    System.out.println();
    
    //Mostrar el array en el orden original
    System.out.println("Y ahora se muestra en el orden "+
    "original");
    for(int i = 0; i<arrayEnteros.length;i++) {
      System.out.println(arrayEnteros[i] + " ");
      }
  
  }
  
  }
