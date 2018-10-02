import java.util.Scanner;
public class Ejercicio7 {
  public static void main(String[] args) {
    
  Scanner s = new Scanner(System.in);
    
  double baseImponible;
  int iva = 21;
  
  System.out.println("Introduzca la base imponible de una factura");
  baseImponible = Double.parseDouble(s.nextLine());  
  
  double totalFactura = (double) (baseImponible * 1.21);
  
  System.out.println("El total de la factura es: " + totalFactura);
  
    
    
    
  }
}




