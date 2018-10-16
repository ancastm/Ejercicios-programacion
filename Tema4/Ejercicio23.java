/**Escribe un programa que calcule el precio final de un producto según su base
 * imponible (precio antes de impuestos),el tipo de iva aplicado (general, reducido
 * o superreducido) y el código promocional. Los tipos de IVA general, reducido
 * y superreducido son del 21%, 10% y 4% respectivamente. Los códigos promocionales
 * pueden ser nopro, mitad, meno5, o 5porc que significan respectivamente que no
 * se aplica promoción, el precio se reduce a la mitad, se descuentan 5 euros, 
 * o de descuenta el 5%. El ejercicio se da por bueno si se muestran los valores 
 * correctos, aunque los números no estén tabulados.
 */
 
 import java.util.Scanner;
 
 public class Ejercicio23 {
   public static void main(String[] args) {
     
    Scanner s = new Scanner(System.in);
    
    double baseImponible;
    
    double tipoIVA = 0;
    
    
      
    
    System.out.println("Introduzca la base imponible: ");
    baseImponible = Double.parseDouble(s.nextLine());
    System.out.println("Introduzca el tipo de IVA (general, reducido, superreducido)");
    String IVA = (s.next());
    System.out.println("Introduzca el código promocional (nopro,mitad,meno5 o 5porc): ");
    String codigoPromocional = (s.next());
    
    switch (IVA) {
      case "general" :
        tipoIVA = 21;
        break;
      case "reducido" :
        tipoIVA = 10;
        break;
      case "superreducido" :
        tipoIVA = 4;
        break;
        default:
          System.out.println("Ese tipo de IVA no existe");
    }
    double IVAnumerico = baseImponible * tipoIVA / 100;
    double precioSinDescuento = baseImponible + IVAnumerico;
    double descuento = 0;
     
     switch (codigoPromocional) {
       case "noPromocion":
          break;
       case "mitad":
          descuento = precioSinDescuento / 2;
          break;
       case "meno5euros":
          descuento = 5;
          break;
       case "cincoPorCiento":
          descuento = precioSinDescuento * 0.05;
          break;
          default:
            System.out.println("Ese código no está especificado");
     }      
     double total = precioSinDescuento - descuento; 
     
     System.out.println("Base Imponible " + baseImponible);
     System.out.println("IVA "      + tipoIVA +  "%" + ": " + IVAnumerico);
     System.out.println("Precio con IVA " + precioSinDescuento);
     System.out.println("Cod.promo " + codigoPromocional + ": "+  descuento);
     System.out.println("TOTAL "  + total);
     
     
   }
 }
 
