import java.util.Scanner;
public class Ejercicio7 {
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
  System.out.printf("La media de las tres notas es: %.2f", mediaNotas);
  
  
  
  
  
  
  
  
  
  
  }
}

