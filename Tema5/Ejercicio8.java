/**Muestra la tabla de multiplicar de un número introducido por teclado.
 */
import java.util.Scanner;

public class Ejercicio8 {
  public static void main(String[] args) {
   
   Scanner s = new Scanner (System.in);
   
   int i = 1;
   int numeroIntroducido = 0;
   
   System.out.println("Este programa muestra la tabla de multiplicar de un número" +
   "introducido por teclado");
   System.out.println("Introduce un número");
   numeroIntroducido = Integer.parseInt(s.nextLine()); 
   
   
   for(numeroIntroducido = numeroIntroducido; i <=10; i++) {
     System.out.println( numeroIntroducido + " x " + i + " = " + (numeroIntroducido * i) );
      
        
   }
     
    
    
    
  }
}



