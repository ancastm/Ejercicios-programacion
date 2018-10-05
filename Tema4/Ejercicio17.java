import java.util.Scanner;
public class Ejercicio17 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    /**Escribe un programa que diga cual es la última cifra de un número introducido
     * por teclado.
     */
     
     int numeroIntroducido;
     
     System.out.println("Este programa dice cual es la última cifra de un " +
     "número introducido por teclado");
     System.out.println("Introduce un número entero");
     numeroIntroducido = Integer.parseInt(s.nextLine());
     
     int ultimaCifra;
     ultimaCifra = numeroIntroducido % 10;
     
     System.out.println("El último dígito del número " + numeroIntroducido + 
     " es: " + ultimaCifra);
    
    
  }
}

