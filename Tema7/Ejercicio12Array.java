package ejercicio12array;

import java.util.Scanner;

/**
 * Realiza un programa que pida 10 números por teclado y que los almacene 
 * en un array. A continuación se mostrará el contenido de ese array junto al 
 * índice (0-9). Seguidamente el programa pedirá dos posiciones a la que llamaremos
 * "inicial" y "final". Se debe comprobar que inicial es menor que final y que
 * ambos números están entre 0 y 9. El programa deberá colocar el número de la
 * posición inicial en la posición final, rotando el resto de números para que
 * no se pierda ninguno. Al final se debe mostrar el array resultante.
 *
 * @author Anabel Castejón Martínez
 */
public class Ejercicio12Array {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int[] numeros = new int[10];
    int[] resultado = new int[10];
    int numeroInicial = 0;
    int numeroFinal =0;
    
    
    //pedir números al usuario
    for (int i = 0; i<10; i++) {
      System.out.println(i + " Introduce 10 números enteros y pulse INTRO");
      numeros[i] = Integer.parseInt(s.nextLine());
    }
    
    //Mostrar el Array Original
    System.out.println("\n Array Original: ");
    System.out.println("\n---------------------------------------------------");
    System.out.print("Índice");
      for(int i=0;i<10;i++) {
        System.out.printf("%4d", i);
      }
      
    System.out.print(" \nValor:");
      
    for(int i=0;i<10;i++) {
      System.out.printf("%4d" , numeros[i]);
    }
    //Guardamos el último elemento para que no se pierda 
    numeroFinal = numeros[9];
    
    //rotamos las posiciones
    
    for(int i = 8; i>=0;i--) {
      numeros[i+1] = numeros[i];
    }
    
    //Metemos el último valor en el primero
    numeros[0] = numeroFinal;
    
    System.out.println();
    
     //Mostrar el Array Final originado
    System.out.println("\n Array Final: ");
    System.out.println("\n---------------------------------------------------");
    System.out.print("Índice");
      for(int i=0;i<10;i++) {
        System.out.printf("%4d", i);
      }
      
    System.out.print(" \nValor: ");
      
    for(int i=0;i<10;i++) {
      System.out.printf("%4d" , numeros[i]);
    }
    
    System.out.println();  
  }

}
