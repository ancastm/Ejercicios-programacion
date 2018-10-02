import java.util.Scanner;
public class Ejercicio11 {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in); 
   
  int mb;
  int kb = 1024;
  
  System.out.println("Introduce los KB que quieres convertir a MB: ");
  kb = Integer.parseInt(s.nextLine());  
  
  int conversion = mb / kb;
  System.out.println(kb + " KB son " + conversion + " MB");
    
    
    
    
    
  }
}
