import java.util.Scanner;
public class Ejercicio2 {
  public static void main(String[] args) {
    
  Scanner s = new Scanner(System.in);
  
  int hora;
  System.out.println("Introduce una hora sin minutos y le saludaré");
  hora = Integer.parseInt(s.nextLine());  
  
  if ((hora >=6) && (hora <=12)) {
    System.out.println("Buenos días");
    }else if((hora >=13) && (hora <=20)) {
      System.out.println("Buenas tardes");
    }else{
      System.out.println("Buenas noches");
    
    }
  }
}
