import java.util.Scanner;

public class Cuadrado {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
   int alturaCuadrado = 0;
   System.out.println("Este programa pinta un cuadrado");
   
   System.out.print("Dime la altura del cuadrado: ");
   alturaCuadrado = Integer.parseInt(s.nextLine());
   
     
      for (int i = 1; i<= alturaCuadrado; i++) {
        
        for (int j =1; j<=alturaCuadrado; j++) {
            
          if (j==1 || j==alturaCuadrado || i ==1 || i==alturaCuadrado) {
                System.out.print("* "); 
          }else {
              System.out.print("  ");
          }      
       
     
    
        
     
        }  
        
        System.out.println();
        
      }
  }
}  

