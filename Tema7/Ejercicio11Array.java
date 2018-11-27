package ejercicio11array;

import java.util.Scanner;

/**
 * Realiza un programa que pida 10 números por teclado y que los almacene en un
 * array. A continuación se mostrará el contenido de ese array junto al índice
 * (0-9) utilizando para ello una tabla. Seguidamente el programa pasará los
 * primos a las primeras posiciones, desplazando el resto de números (los que no
 * son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
 * el array resultante.
 *
 * @author Anabel Castejón Martínez
 */
public class Ejercicio11Array {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    int i = 0;
    int numeros[] = new int[10];
    int primos[] = new int[10];
    int noPrimos[] = new int[10];
    int prim=0;
    int noPrim=0;
    boolean esPrimo = false;
    
    System.out.println("Introduzca 10 números y pulse INTRO: ");
    for (i = 0; i < 10; i++) {
      numeros[i] = Integer.parseInt(s.nextLine());
    
        //saber si un numero es primo o no
        esPrimo = true;
        for(int j = 2;j<numeros[i]-1;j++) {
         if(numeros[i] %j == 0) {
            esPrimo = false;
         }
        }
    
        //si el numero es primo se mete en un array y si no lo es, se mete en otro
        //diferente
        if(esPrimo) {
          primos[prim++] = numeros[i];
        }else{
          noPrimos[noPrim++] = numeros[i];
        }
    }
    
    //Mostrar el Array Original
    System.out.println("Array Inicial");
    System.out.println("\n---------------------------------------------------");
    System.out.print("Índice ");
    for (i = 0; i < 10; i++) {
      System.out.printf("%4d", i);
    }

    System.out.print("\nValor ");
    for (i = 0; i < 10; i++) {
      System.out.printf("%4d", numeros[i]);
    }
    System.out.println();
    //Los numeros primos se meten en las primeras posiciones del array original
    for(i = 0;i<prim;i++) {
      numeros[i] = primos[i];
    }
    //Los no primos se quedan al final
    for(i=prim; i<prim+noPrim; i++) {
      numeros[i] = noPrimos[i-prim];
    }
    System.out.println();
    //Muestra el Array Final
    System.out.println("Array Final");
    System.out.println("\n---------------------------------------------------");
    System.out.print("Índice ");
    for (i = 0; i < 10; i++) {
      System.out.printf("%4d", i);
    }

    System.out.print("\nValor ");
    for (i = 0; i < 10; i++) {
      System.out.printf("%4d", numeros[i]);
    }

    System.out.println();
  }

}
