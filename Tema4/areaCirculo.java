import java.util.Scanner;
public class AreaCirculo {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
  //Pedir el radio de un circulo y calcular el área. A = Π x r² 
  double radioCirculo;
  System.out.println("Introduce el radio de un círculo y calcularé su área");
  radioCirculo = Integer.parseInt(s.nextLine());
  double pi = 3.14;
  double area = (pi * radioCirculo * radioCirculo);
  System.out.println("El área de un círculo es: " + area);
  
  
  }
}

