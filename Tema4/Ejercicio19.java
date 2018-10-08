import java.util.Scanner;
public class Ejercicio19 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    /**Realiza un programa que nos diga cuántos dígitos tiene un número entero
     * que puede ser positivo o negativo. Se permiten números de hasta 5 
     * dígitos.
     */
     
     int numeroIntroducido = 0;
     int numeroDigito = 0;
     
     System.out.println("Este programa dice cuántos dígitos tiene un número " +
     "entero que puede ser positivo o negativo. ");
     System.out.println("Introduce un número de hasta 5 cifras, positivo o negativo: ");
     //asi nos devuelve el valor absoluto de un número
     numeroIntroducido = Math.abs(Integer.parseInt(s.nextLine()));
     
     if (numeroIntroducido < 10) {
       numeroDigito = 1;
     }
     if ((numeroIntroducido >= 10) && (numeroIntroducido < 100)) {
       numeroDigito = 2;
     }
     if ((numeroIntroducido >=100) && (numeroIntroducido < 1000)) {
       numeroDigito = 3;
     }
     if ((numeroIntroducido >= 1000) && (numeroIntroducido < 10000)) {
       numeroDigito = 4;
     }
     if (numeroIntroducido >= 10000) {
       numeroDigito = 5;
     }
    
    System.out.println("El número introducido tiene " + numeroDigito + " dígitos");
    
    
  }
}

