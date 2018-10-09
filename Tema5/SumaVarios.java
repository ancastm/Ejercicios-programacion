import java.util.Scanner;
public class SumaVarios {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    
    int acumulador = 0;
    int sumando;
    System.out.print("Introduzca el nº de números que quiere sumar: ");
    int sumaNumeros = Integer.parseInt(s.nextLine());
    
    for (int i = 1; i <= sumaNumeros; i++) {
      System.out.print("Introduzca el sumando nº " + i +": ");
      sumando = Integer.parseInt(s.nextLine());
      acumulador += sumando;
    }
    
    System.out.print("La suma de los " + sumaNumeros + " números introducidos es " + acumulador);
    
    
    
    
  }
}

  
