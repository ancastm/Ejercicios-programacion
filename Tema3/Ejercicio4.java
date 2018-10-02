import java.util.Scanner;
public class Ejercicio4 {
  public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   int numero1;
   int numero2;
   
   System.out.println("Introduzca un primer número: ");
   numero1 = Integer.parseInt(s.nextLine());
   
   System.out.println("Introduzca un segundo número: ");
   numero2 = Integer.parseInt(s.nextLine());
   
   int resultadoSuma = numero1 + numero2;
   int resultadoResta = numero1 + numero2;
   int resultadoMultiplicacion = numero1 * numero2;
   double resultadoDivision = numero1 / numero2;
   
   System.out.println("La suma de ambos números es : " + resultadoSuma); 
   System.out.println("La resta de ambos números es: " + resultadoResta); 
   System.out.println("La multiplicación de ambos números es: "  + resultadoMultiplicacion); 
   System.out.println("La división de ambos números es: " + resultadoDivision); 
   
    
    
    
  }
}

