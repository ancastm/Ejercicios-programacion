import java.util.Scanner;
public class Ejercicio11 {
  public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   
   int hora;
   int minutos;
   System.out.println("Introduce una hora con sus minutos y calcularé lo que falta "+
   "para la medianoche: ");
    hora = Integer.parseInt(s.nextLine());
    minutos = Integer.parseInt(s.nextLine());
   
   int segundosPasados = (hora * 3600) + (minutos * 60);
   int segundosHastaMedianoche = (24 * 3600) - segundosPasados;
   
   System.out.println("Desde las: " + hora + " horas " + minutos + " minutos" + " ,faltan "+ 
   segundosHastaMedianoche + " segundos para llegar a la medianoche.");
   
    
    
    
    
    
    
    
    
    
    
  }
}

