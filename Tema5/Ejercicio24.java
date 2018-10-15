/**Escribe un programa que lea un número n e imprima una pirámide de números
 * con n filas como en la siguiente figura:
 *    1
 *   121
 *  12321
 * 1234321 
 */
 
 import java.util.Scanner;
 
 public class Ejercicio24 {
   public static void main(String[] args) {
     
    Scanner s = new Scanner(System.in);
     
    System.out.println("Este programa pinta una piráḿide con n números introducidos");
    System.out.print("Introduce la altura de la pirámide: ");
    int alturaIntroducida = Integer.parseInt(s.nextLine());
     
     
    int filas = 1;
    int i = 0;
    int contadorEspacios = alturaIntroducida - 1; 
     
    
    
    //bucle para insertar los espacios
    
    while (filas <= alturaIntroducida ) {
      
      //for para insertar los espacios
      
      for (i = 1; i <= contadorEspacios; i++) {
        System.out.print(" ");
      }
      
      //for para pintar la línea de la pirámide
      
      for (i = 1; i < filas; i++) {
        System.out.print(i);
      }
      
      for (i = filas; i > 0; i--) {
        System.out.print(i);
      }
      
    
    System.out.println();
    
    
    filas++;
    contadorEspacios--;
        
    }
   
     
         
   }
 }
