package ejercicio5;

import java.util.Scanner;

/**
 * Programa que realiza una figura a partir de un numero introducido por
 * teclado.
 *
 * @author Anabel Castejón Martínez
 */
public class Ejercicio5 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.println("Este programa crea una figura a partir de un número "
      + "introducido por teclado");
    System.out.print("Introduce un número: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());

    int contadorEspacio = 1;

    for (int i = 1; i <= numeroIntroducido; i++) {
      System.out.println(i);
      for (int j = 1; j <= contadorEspacio; j++) {
        System.out.print(" ");

      }
      contadorEspacio++;

    }
    System.out.println();
  }

}
