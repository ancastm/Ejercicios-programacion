/**Realiza un programa que sume los 100 números siguientes a un número entero
 * y positivo introducido por teclado. Se debe comprobar que el dato introducido
 * es correcto (que es número positivo).
 */
 
 import java.util.Scanner;
 
 public class Ejercicio17 {
   public static void main(String[] args) {
     
    Scanner s = new Scanner (System.in);
    
        
    System.out.println("Este programa suma los 100 números siguientes a un número " +
    "introducido por teclado. ");
    System.out.print("Introduce un número entero positivo: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());
    
    for (int i = numeroIntroducido; i <= numeroIntroducido + 100; i++) {
      
        System.out.println(i);
      
    }  
     
   }
 }
   
