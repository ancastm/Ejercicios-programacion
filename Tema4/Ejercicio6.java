import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
  //Realiza el programa que tardará en caer un objeto desde una altura h.
  //Aplica la fórmula t = raiz cuadrada de 2h/g. Siendo g = 9.81m(2)/s.
  
  double altura;
  double gravedad = 9.81;
  
  System.out.println("Este programa calcula el tiempo que tardará en caer un " +
   "objeto desde una altura concreta");
  System.out.println("Introduzca la altura");
  altura = Double.parseDouble(s.nextLine());
  
  double caidaObjeto = Math.sqrt(2*altura/gravedad);
  
  System.out.printf("El objeto tarda en caer %.2f segundos" , caidaObjeto); 
  
  
    
  }
}

