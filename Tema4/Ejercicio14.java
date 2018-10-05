import java.util.Scanner;
public class Ejercicio14 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
   /**Realiza un programa que diga si un número introducido por teclado es
    * par y/o divisible entre 5
    **/
    
    int numeroIntroducido;
    
    
    System.out.println("Este programa nos dice si un número introducido por " +
    "teclado es par y/o divisible entre 5");
    System.out.println("Introduce un número: ");
    
    numeroIntroducido = Integer.parseInt(s.nextLine());
    
    if ((numeroIntroducido % 2) == 0)  {
      System.out.print("Este número es par");
    }else {
      System.out.print("Este número NO es par");
    } 
    
    if ((numeroIntroducido % 5) == 0) {
      System.out.println(" y divisible entre 5");
    
    } else {
       System.out.println("Este número no es par ni divisible entre 5");
    }
    
      
  }
}

