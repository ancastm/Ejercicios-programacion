import java.util.Scanner;
public class BucheFor {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
   int laVoluntad;
   System.out.println("Dime cuantos números quieres que escriba: ");
   laVoluntad = Integer.parseInt(s.nextLine());
   
   for (int i = 1; i <= laVoluntad; i++) {
     System.out.println(i);
   }
   
  
  }
}

