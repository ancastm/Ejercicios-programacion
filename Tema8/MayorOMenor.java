
package mayoromenor;
import java.util.Scanner;

/**Crar una función que diga si un número es mayor o menor que cero
 *
 * @author Anabel Castejón Martínez
 */
public class MayorOMenor {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca un número: ");
    int num = Integer.parseInt(s.nextLine());
    
    
    if (mayorMenor(num)) {
      System.out.println("El número es mayor a cero");
    }else {
      System.out.println("El número es menor a cero");
    }
    }
  public static boolean mayorMenor(int numero) {
    
    //esto quiero decir que devuelve true
    return numero>0;
  }
  
}
