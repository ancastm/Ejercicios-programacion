package ejercicio5aleatorio;

/**
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra también el máximo, el mínimo y la media de
 * esos números.
 *
 * @author Anabel Castejón Martínez
 */
public class Ejercicio5Aleatorio {

  public static void main(String[] args) {

    int maximo = 100;
    int minimo = 199;
    int suma = 0;
    int numero;

    System.out.println("Este programa muestra 50 números aleatorios entre 100 "
      + "y 199. También muestra el máximo, el mínimo y la media de ellos");
    System.out.println("Los números son: ");
    for (int i = 1; i <= 50; i++) {
      numero = (int) (Math.random() * 100) + 100;
      System.out.print(numero + " ");
      suma += numero;
      //comparar los valores para sacar el maximo y el minimo
      if (numero < minimo) {
        minimo = numero;
      }
      if (numero > maximo) {
        maximo = numero;
      }
    }
    System.out.println("\nEl máximo es: " + maximo + "\nEl mínimo es: " + 
      minimo + "\nLa media es: " + suma / 50);

  }

}
