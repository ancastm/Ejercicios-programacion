/**Realice un programa que presente por pantalla una lista de números en orden
 * creciente. Los números no serán consecutivos, sino que irán saltando, según
 * se le indique el programa. El programa pedirá la cantidad de números que se 
 * van a mostrar, a partir de qué número se inicia la lista y el "salto" entre
 * los números.
 */
 
 import java.util.Scanner;
 
 public class Ejercicio3 {
   public static void main(String[] args) {
     
     Scanner s = new Scanner(System.in);
     
     System.out.println("Este programa presenta por pantalla una lista de números " +
     "no consecutivos ");
     System.out.print("Introduzca la cantidad de números: ");
     int numero = Integer.parseInt(s.nextLine());
     
     System.out.print("Introduzca el primer número: ");
     int primerNumero = Integer.parseInt(s.nextLine());
     
     System.out.print("Introduzca el salto: ");
     int salto = Integer.parseInt(s.nextLine());
     
     for (int i = 0; i<numero; i++) {
       System.out.print(primerNumero +   "-");
       primerNumero += salto;
      }       
       

       
     
     
     
     
     
     
     
     
  }
}     
     
     
     
      
