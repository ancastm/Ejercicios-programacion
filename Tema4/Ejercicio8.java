import java.util.Scanner;
public class Ejercicio8 {
  public static void main(String[] args) {
    
  Scanner s = new Scanner(System.in);
  
  double nota1;
  double nota2;
  double nota3;
  
  System.out.println("Introduce tres notas y te haré la media");
  nota1 = Double.parseDouble(s.nextLine());
  nota2 = Double.parseDouble(s.nextLine());
  nota3 = Double.parseDouble(s.nextLine());
  
   double mediaNotas = (nota1 + nota2 + nota3) /3;
  
  if (mediaNotas<5) {
      System.out.println("Insuficiente");
  }if ((mediaNotas >= 5) && (mediaNotas <6)) {
    System.out.println("Suficiente");
  }if ((mediaNotas>= 6) && (mediaNotas <7)) {
    System.out.println("Bien");
  }if ((mediaNotas >= 7) && (mediaNotas <8)) {
    System.out.println("Notable");
  }if ((mediaNotas >= 8) && (mediaNotas >9)){
    System.out.println("Sobresaliente");
  }       
 
  System.out.printf("La media de las tres notas es: %.2f", mediaNotas); 
  
      
  }
}

