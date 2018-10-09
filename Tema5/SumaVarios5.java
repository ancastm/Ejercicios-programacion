import java.util.Scanner;
public class SumaVarios5 {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    
    int acumulador = 0;
    int sumando= 1;
    int sumaNumeros;
    
    
    //do {
      for (;sumando !=0;) {
      System.out.print("Introduzca el sumando (0 para terminar): ");
      sumando = Integer.parseInt(s.nextLine());
      //para metiendo un 1 sin que sume dicho número
     
    }
    //}while (sumando !=0);
    
    System.out.print("La suma de los números introducidos es " + acumulador );
    
    
    
    
  }
}

  
