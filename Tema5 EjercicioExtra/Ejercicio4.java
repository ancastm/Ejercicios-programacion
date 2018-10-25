/**Realice un programa que presente por pantalla una lista de números enteros en
 * orden decreciente. El programa pedirá el valor más alto, el valor más bajo y 
 * el salto que habrá entre un número y número.
 */
 
 import java.util.Scanner;
 
 public class Ejercicio4 {
   public static void main(String[] args) {
     
     Scanner s = new Scanner(System.in);
     
    System.out.print("Introduzca el número más alto: ");
    int numeroAlto = Integer.parseInt(s.nextLine());
    
    System.out.print("Introduzca el número más bajo: ");
    int numeroBajo = Integer.parseInt(s.nextLine());
    
    System.out.print("Introduzca el salto: ");
    int salto = Integer.parseInt(s.nextLine());
    
    for (int i = numeroAlto; i > numeroBajo; i-=salto) {
      
      System.out.print(numeroAlto+ "-");
      
      numeroAlto -= salto;
      
    } 
     
     
  }
}     
