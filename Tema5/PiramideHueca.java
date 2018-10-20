import java.util.Scanner;

public class PiramideHueca {
  public static void main(String[] args) {
    
    Scanner s = new Scanner (System.in);
    
   System.out.println("Este programa pinta un pirámide hueca");
   
   System.out.print("Dime la altura que va a tener la pirámide: "); 
   int altura = Integer.parseInt(s.nextLine());
   
   System.out.println("Dime el carácter con el que se a pintar la pirámide: ");
   String caracter = s.next(); 
   
   int inicio = altura; 
   int fin = altura;
   int finFila = altura * 2 -1;
  
  
  for (int i = 1; i <= altura; i++) {   
    for (int fila = 1; fila<= finFila; fila++) {
            
            if ((inicio == fila) || (fin == fila) || (i == altura)) {
              System.out.print(caracter);
            } else {
              System.out.print(" ");
            }   
              
        }  
        
    System.out.println();   
    inicio--;
    fin++;
    
    
    
  }    
    
    
    
  }
}

