public class Ejercicio6 {
  public static void main(String[] args) {
  
  double baseImponible = 105.56;
  int iva = 21;
  double totalFactura = (double) (baseImponible * 1.21);
  
  System.out.printf("%-10s\n", "FACTURA");
  System.out.println("--------------");
  System.out.printf("%-10s\n", "Base Imponible " + baseImponible);
  System.out.printf("%-10s\n", "IVA " + iva);
  //para hacer que el total aparezca dos decimales se necesita poner %.2f
  System.out.printf("%-10s\n", "Total " + totalFactura);
  
  
}
  }
  
