import java.util.Scanner;
public class Ejercicio18 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    /**Escribe un programa que diga cual es la primera cifra de un número entero
     * introducido por teclado. Se permiten números de hasta cinco cifras.
     */
     
     int numeroIntroducido = 0;
     int primeraCifra = 0;
     
     System.out.println("Este programa dice cual es la primera cifra de un " +
     "número introducido por teclado. Se permite números de hasta cinco cifras.");
     System.out.println("Introduce un número entero: ");
     numeroIntroducido = Integer.parseInt(s.nextLine());
     
     if (numeroIntroducido < 10) {
       primeraCifra = numeroIntroducido;
     }
     if ((numeroIntroducido >=10) && (numeroIntroducido < 100)) {
       primeraCifra = numeroIntroducido / 10;
     }
     if ((numeroIntroducido >= 100) && (numeroIntroducido < 1000)) {
       primeraCifra = numeroIntroducido / 100;
     }
     if ((numeroIntroducido >= 1000) && (numeroIntroducido < 10000)) {
       primeraCifra = numeroIntroducido / 1000;
     }
     if (numeroIntroducido >= 10000) {
       primeraCifra = numeroIntroducido / 1000;
     }
     
     System.out.println("La primera cifra del número introducido es: " + primeraCifra);
     
     
     
    
    
  }
}

