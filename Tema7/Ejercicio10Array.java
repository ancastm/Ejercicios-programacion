package ejercicio10array;

/**
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y
 * que los almacene en un array. El programa debe ser capaz de pasar todos los
 * números pares a las primeras posiciones y las impares a las celdas restantes.
 * Utiliza arrays auxiliares si es necesario.
 *
 * @author Anabel Castejón Martínez
 */
public class Ejercicio10Array {

  public static void main(String[] args) {

    int[] numeros = new int[20];
    int[] pares = new int[20];
    int[] impares = new int[20];
    int par = 0;
    int impar = 0;
    int i = 0;

    //Genera los 20 numeros aleatorios
    for( i =0;i<20;i++) {
      numeros[i] = (int)(Math.random()*101);
      //separa los pares en un array y los impares en otro
      if(numeros[i] % 2==0) {
        pares[par++] = numeros[i];
      }else{
        impares[impar++] = numeros[i];
      }
    }
    System.out.println("Array Original");
    for(i=0;i<20;i++) {
      System.out.print(numeros[i] + " ");
    }
    
    //Pasamos los números pares a las primeras posiciones
    for(i = 0; i<par;i++) {
      numeros[i] = pares[i];
    }
    //Pasamos los impares a los huecos finales
    for(i = par; i<20; i++) {
      numeros[i] = impares[i-par];
    }
    System.out.println();
    //El resultado final 
    System.out.println("Array resultado con los pares al principio y los impares"
      + " al final:");
    for(i=0;i<20;i++) {
      System.out.print(numeros[i] + " ");
    }
    System.out.println();
    
  }

}
