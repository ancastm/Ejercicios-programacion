/**Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. 
 * El programa pedirá la altura. El palo horizontal de la L tendrá una longitud
 * de la mitad (división entera entre 2) de la altura más uno.
 */
 
 import java.util.Scanner;
 
public class Ejercicio31 {
  public static void main(String[] args) {
    
   Scanner s = new Scanner(System.in);
   
   int alturaIntroducida;
   
   System.out.println("Este programa pinta la letra L hecha con asteriscos");
   
   System.out.print("Introduce la altura de la letra: ");
   alturaIntroducida = Integer.parseInt(s.nextLine());
   
  // bucle para pintar la línea vertical de la L
  
  for (int i = 1; i < alturaIntroducida; i++) {
    System.out.println( "*" );
  }
  //bucle para pintar la base de la L
  for (int i = 0; i < alturaIntroducida / 2 + 1; i++) {
        System.out.print( "* " );
  }
    
    
  }
}
 
