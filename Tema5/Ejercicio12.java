/**Escribe un programa que escriba los n términos de la serie de Fibonacci, 
 * introduciendo n por teclado. El primer término de la serie es 0, el segundo
 * término es 1 y el resto se calcula sumando los dos anteriores, por lo que
 * tendríamos que la serie queda como 0,1,1,2,3,5,8.... El número n se debe 
 * introducir por teclado.
 */
 
 import java.util.Scanner;
 
 public class Ejercicio12 {
   public static void main(String[] args) {
     
    Scanner s = new Scanner(System.in);
          
    System.out.println("Este programa te calcula a partir de un número introducido "+
    "por teclado, la serie de Fibonacci");
    System.out.print("Introduce un número: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());
    
    switch (numeroIntroducido) {
      case 1: 
        System.out.print("0");
      break;
      
      case 2:
        System.out.print("0,1");
      break;
      default:
        System.out.print("0,1");
        
        int primerTermino = 0;
        int segundoTermino = 1;
        int aux;
        
          while (numeroIntroducido > 2) {
            aux = primerTermino;
            primerTermino = segundoTermino;
            segundoTermino = aux + segundoTermino;
            System.out.print(", " + segundoTermino);
            numeroIntroducido--;
          }
          
          
      }      
        
        
    
    
     
   }
 }
