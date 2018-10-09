import java.util.Scanner;
public class SumaVarios3 {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    
    int acumulador = 0;
    int sumando = 9;

    
    
    while (sumando != 0) {
      System.out.print("Introduzca el sumando (0 para terminar): ");
      sumando = Integer.parseInt(s.nextLine());
       acumulador += sumando;
      }
    
    
    System.out.print("La suma de los números introducidos es: " + acumulador );
    
    
    
    
  }
}

  
