
package devuelvesuma;

/**Función que devuelve la suma de dos números pasados por parámetros
 *
 * @author Anabel Castejón Martínez
 */
public class DevuelveSuma {

 
  public static void main(String[] args) {
  
    int a = 5;
    int b = 10;
    
    //la función tambień se puede guardar en una variable
    System.out.println("La suma de los parámetros es: " + devuelveSuma(a,b));
  }
  public static int devuelveSuma(int a, int b) {
    
    return a+b;
  }
  
}
