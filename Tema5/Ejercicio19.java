/**Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * introducir por teclado. El carácter con el que se pinta también se debe
 * pedir por teclado.
 */
 
 import java.util.Scanner;
 
 public class Ejercicio19 {
   public static void main(String[] args) {
     
     Scanner s = new Scanner(System.in);
     
     int altura;
     String caracter;
     int i = 0;
     
     System.out.println("Este programa pinta una pirámide por pantalla.");
     System.out.print("Introduce la altura:");
     altura=Integer.parseInt(s.nextLine());
     
     System.out.print("Introduce el carácter: ");
     caracter = s.next();
     
     //se inicializa en 1 porque en la primera fila sólo iría un carácter
     int contadorCaracter = 1;
     
     int espacios = altura - 1;
     
     //bucle para pintar cada línea
     for ( i = 1; i <= altura; i++) {
       System.out.print(" ");
        
        //bucle para pintar los espacios
        for (int j =1; j <= espacios; j++) {
          System.out.print(" ");
        }    
        //bucle para pintar los caracteres
        for (int j=1; j<=contadorCaracter;j++) {
          System.out.print(caracter);
        }
        //para saltar de línea al final de cada fila.
     System.out.println();
     //se disminuiría porque cada vez que se pinta una fila, los espacios van en
     //detrimento, hasta que en la última fila desaparecen.
     espacios--;
     //se aumentaría en 2 porque los caracteres en la pirámide irían: 
     //en la primera fila sería 1 carácter; en la segunda fila serían 3 caracteres
     //y así sucesivamente.
     contadorCaracter+=2;
     
    }
     
     
   }
 }
 
