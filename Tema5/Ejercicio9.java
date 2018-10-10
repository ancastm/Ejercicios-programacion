/**Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado. Este ejercicio es equivalente a otro realizado anteriormente, 
 * con la salvedad de que el anterior estaba limitado a números de 5 dígitos
 * como máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles;
 * de esta manera, la única limitación en el número de dígitos la establece el 
 * tipo de dato que se utilice (int o long).
 */
 

 
 import java.util.Scanner;
 public class Ejercicio9 {
   public static void main(String[] args) {
     
    Scanner s = new Scanner(System.in);
    
    
    int numeroIntroducido;
    int valorOriginal;
    int numeroDigitos = 1;
    
    System.out.println("Este programa dice cuántos dígitos tiene un número.");
    System.out.print("Introduce un número: ");
    numeroIntroducido = Integer.parseInt(s.nextLine()); 
     //se igualan estas variables para que no se machaque el numero introducido.
     //por ejemple si no se hiciera asi, al ejecutar 52 te dice que tiene 2
     //digitos pero solo te cuenta el 5 porque machaca el numero 
    valorOriginal = numeroIntroducido;
     
    while (valorOriginal > 10) {
      valorOriginal /= 10;
      numeroDigitos++;
    }   
    
    System.out.println(numeroIntroducido + " tiene " + numeroDigitos + " dígitos"); 
     
   }
 }
 
 
