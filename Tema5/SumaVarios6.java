import java.util.Scanner;
public class SumaVarios6 {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    
    int acumulador = 0;
    int sumando;
    int contador = 0;
    
    
    do {
      System.out.print("Introduzca el sumando (1 para terminar): ");
      sumando = Integer.parseInt(s.nextLine());
      acumulador += sumando;
      contador++;
        
    }while (sumando !=0);
    
    System.out.print("La suma de los números introducidos es " + acumulador );
    
    
    
    
  }
}

  
