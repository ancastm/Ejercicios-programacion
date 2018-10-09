import java.util.Scanner;
public class SumaVarios2 {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    
    int acumulador = 0;
    int sumando;
    int sumaNumeros;
    
    
    do {
      System.out.print("Introduzca el sumando (1 para terminar): ");
      sumando = Integer.parseInt(s.nextLine());
      //para metiendo un 1 sin que sume dicho número
      if (sumando !=1) {
        
      acumulador += sumando;
    }
    }while (sumando !=0);
    
    System.out.print("La suma de los números introducidos es " + acumulador );
    
    
    
    
  }
}

  
