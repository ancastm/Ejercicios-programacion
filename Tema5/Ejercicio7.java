/**Realiza el control de acceso de una caja fuerte. La combinación será un número
 * de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no acertamos,
 * se nos mostrará el mensaje "Lo siento, esa no es la combinación", y si acertamos
 * se nos dirá "La caja fuerte se ha abierto satisfactoriamente". Tendremos cuatro
 * oportunidades para abrir la caja fuerte.
 */
 import java.util.Scanner;
 
 public class Ejercicio7 {
   public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     
        int oportunidades = 4;
        int i;
        int combinacion = 5623 ;
        
        do {
            System.out.println("Introduce la combinacion de la caja fuerte(" + oportunidades + " intentos): ");
            i = Integer.parseInt(s.nextLine());
            if (i==combinacion) {
                System.out.println("La caja fuerte se ha abierto correctamente.");
                
            } else {
                System.out.println("Lo siento, la combinacion no es correcta.");
                oportunidades--;
            }
        } while ((i!=combinacion)&&(oportunidades>0));
    }

}
