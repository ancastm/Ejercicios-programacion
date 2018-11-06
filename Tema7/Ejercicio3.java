
package ejercicio3;


/**Escribe un programa que lea 10 números por teclado y que luego muestre
 * en orden inverso, es decir, el primero que se introduce es el último
 * en mostrarse y viceversa.
 *
 * @author Anabel Castejón Martínez
 */
public class Ejercicio3 {

   public static void main(String[] args) {
    
    
     
     int [] numero = new int [10];
     
     numero[0] = 20;
     numero[1] = 55;
     numero[2] = 130;
     numero[3] = 500;
     numero[4] = 7;
     numero[5] = 10;
     numero[6] = 9;
     numero[7] = 23;
     numero[8] = 35;
     numero[9] = 5;
     
    System.out.println("Los números introducidos son: "); 
    for (int i = 0; i<9; i++) {
      System.out.println(numero[i]);
    }
     
    
     System.out.println("Los números al revés son: ");
       
     for (int i = 9; i>0; i--) {
       
       System.out.println(numero[i]);
     }
     
     
  }
  
}
