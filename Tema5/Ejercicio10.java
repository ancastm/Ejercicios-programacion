/**Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se 
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
 */
import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {
   
   Scanner s = new Scanner(System.in);
   
   double acumulador = 0;
   int valor;
   int conteo = 0;
   double media;
   
   System.out.println("Este programa calcula la media de un conjunto de números "+
   "positivos introducidos por teclado.");
   
   
    do {
      System.out.println("Introduce números positivos, el programa terminará cuando" +
   " introduzca un número negativo: ");
      valor = Integer.parseInt(s.nextLine());
      if (valor >=0) {
        acumulador += valor;
        conteo++;
      }
      
    }while(valor >= 0);  
    
    media = acumulador / conteo;
    System.out.println ("La media de los valores introducidos es " + media);
    
  }
}



