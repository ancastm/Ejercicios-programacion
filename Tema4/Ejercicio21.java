/**Calcula la nota de un trimestre de la asignatura programación. El programa
 * pedirá las dos notas que ha sacado el alumno en los dos primeros controles. 
 * Si la media de los dos controles da un número mayor o igual a 5, el alumno
 * está aprobado y se mostrárá la media. En caso de que la media sea un número
 * menor que 5, el alumno habrá tenido que hacer el examen de recuperación que se
 * califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cual ha
 * sido el resultado de la recuperación? (apto o no apto). Si el resultado de la 
 * recuperación es apto, la nota será un 5; en caso contrario, se mantiene la nota
 * media anterior.
 * Ejemplo 1
 * Nota del primer control: 7
 * Nota del segundo control: 10
 * Tu nota de programación es: 8.5
 * Ejemplo 2
 * Notra del primer control: 5
 * Notra del segundo control: 3
 * ¿Cual ha sido el resultado de la recuperación? (apto/no apto): apto
 * Tu nota de programación es: 5
 * Ejemplo 3
 * Nota del primer control: 5
 * Nota del segundo control: 3
 * ¿Cual ha sido el resultado de la recuperación? (apto/no apto): no apto
 * Tu nota de programación es: 4.5
 */
 
 import java.util.Scanner;
 
 public class Ejercicio21 {
   public static void main(String[] args) {
   
   Scanner s = new Scanner(System.in);
   
   double notaPrimerControl;
   double notaSegundoControl;
   double media = 0;
   String resultadoRecuperacionApto = "apto";
   
   
   System.out.println("Este programa calcula la media de programación");
   System.out.println("Nota del primer control: ");
   notaPrimerControl = Double.parseDouble(s.nextLine());
   System.out.println("Nota del segundo control: ");
   notaSegundoControl = Double.parseDouble(s.nextLine());
   
   if (media >= 5) {
    media = (notaPrimerControl + notaSegundoControl) / 2;
   System.out.println("Tu nota de programación es: " + media);
  }else{
    System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
    resultadoRecuperacionApto = s.next();
      if (resultadoRecuperacionApto.equals("apto")) {
      System.out.println("Tu nota de programación es: 5");
      }else{
        media = (notaPrimerControl + notaSegundoControl) / 2;
        System.out.println("Tu nota de programación es: " + media);
      }
      
    
  }
  
  
  
  
   
   
 }
}

 
 
