import java.util.Scanner;

public class PiramideConCaracterDentro {
  public static void main(String[] args) {
    
    Scanner s = new Scanner (System.in);
    
     System.out.println("Este programa pinta un pirámide hueca");
   
     System.out.print("Dime la altura que va a tener la pirámide: "); 
     int altura = Integer.parseInt(s.nextLine());
   
    System.out.print("Dime el carácter con el que se a pintar la pirámide: ");
    String caracter = s.next(); 
   
    System.out.print("Dime el siguiente carácter con el que se va a rellenar " +
    "la pirámide: ");
    String caracterRelleno = s.next();  
    int inicio = altura; 
    int fin = altura;
    int finFila = altura * 2 -1;
    
  
      for (int i = 1; i <= altura; i++) {   
        for (int fila = 1; fila<= finFila; fila++) {
            
            if ((inicio == fila) || (fin == fila) || (i==altura)) {
              System.out.print(caracter);
            } else if ((inicio>fila) || (fin<fila)) {
              System.out.print(" ");
            } else {
              System.out.print(caracterRelleno);
            }  
               
              
        }      
        
        System.out.println();   
        inicio--;
        fin++;
      }    
    
  }
}

