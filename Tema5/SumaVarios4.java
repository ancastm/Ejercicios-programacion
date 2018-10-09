import java.util.Scanner;
public class SumaVarios4 {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    
    int acumulador = 0;
    int sumando;
    System.out.print("Introduzca el nº de números que quiere sumar: ");
    int sumaNumeros = Integer.parseInt(s.nextLine());
    
    int i = 0;
    
    while (i<sumaNumeros) {
      System.out.print("Introduzca el sumando nº " + i +": ");
      sumando = Integer.parseInt(s.nextLine());
      acumulador += sumando;
      i++;
    }
    
    System.out.print("La suma de los " + sumaNumeros + " números introducidos es " + acumulador);
    
    
    
    
  }
}

  
