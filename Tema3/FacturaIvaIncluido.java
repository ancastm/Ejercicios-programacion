import java.util.Scanner;
public class FacturaIvaIncluido {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
   double baseImponibleConIva;
   int iva = 21;
    
   System.out.println("Introduce la base imponible de la factura:");
   baseImponibleConIva = Double.parseDouble(s.nextLine());
   
   double totalFacturaSinIva = (double) (baseImponibleConIva / 1.21);
   
   System.out.println("El total de la factura es: " + totalFacturaSinIva); 
    double ivaIncluido = baseImponibleConIva - totalFacturaSinIva;
   System.out.println("El iva incluido es: " + ivaIncluido);
    
  }
}  

