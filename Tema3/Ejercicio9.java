import java.util.Scanner;
public class Ejercicio9 {
  public static void main(String[] args) {
    
  Scanner s = new Scanner(System.in);
  
  
  double pi = 3.1416;
  double radio;
  double altura;
  
  System.out.println("Introduce el radio de un cono: ");
  radio = Double.parseDouble(s.nextLine());
  
  System.out.println("Introduce la altura de un cono: ");
  altura = Double.parseDouble(s.nextLine());
  
  double volumen = (pi * radio * radio * altura) / 3;
    
   System. out.println("El volumen de un cono es: " + volumen);
    
    
    
  }
}

