import java.util.Scanner;
public class Ejercicio10 {
  public static void main(String[] args) {
   Scanner s = new Scanner(System.in); 
  double mb;
  int kb = 1024;
  
  System.out.println("Introduce los MB que quieres convertir a KB: ");
  mb = Double.parseDouble(s.nextLine());  
  
  double conversion = (double) (mb * kb);
  System.out.println(mb + " MB son " + conversion + " KB");
    
    
    
    
    
  }
}

