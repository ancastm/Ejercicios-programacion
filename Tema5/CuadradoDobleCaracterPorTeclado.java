import java.util.Scanner;

public class CuadradoDobleCaracterPorTeclado {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
   int alturaCuadrado = 0;
   System.out.println("Este programa pinta un cuadrado");
   
   System.out.print("Dime la altura del cuadrado: ");
   alturaCuadrado = Integer.parseInt(s.nextLine());
   
   System.out.print("Dime el carácter para pintar el cuadrado: ");
   String caracter = s.next();
   
     //bucle para las columnas
      for (int i = 1; i<= alturaCuadrado; i++) {
        
        //bucle para las filas        
        for (int j =1; j<=alturaCuadrado; j++) {
            
          if (j==1 || j==alturaCuadrado || j == 2 || j ==alturaCuadrado - 1 || i==alturaCuadrado -1 || i ==1 || i==alturaCuadrado || i==2) {
                System.out.print (caracter + "  "+ "" ); 
          }else  {
              System.out.print("   ");
          }      
       
     
    
        
     
        }  
        
        System.out.println();
        
      }
  }
}  

