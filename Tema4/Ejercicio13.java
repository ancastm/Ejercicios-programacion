import java.util.Scanner;
public class Ejercicio13 {
  public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
    
  int numero1;
  int numero2;
  int numero3;
  int aux; //se declara esta variable para intercambiar los valores anteriores.
  System.out.println("Introduce tres números y los ordenaré: ");
  numero1 = Integer.parseInt(s.nextLine());
  numero2 = Integer.parseInt(s.nextLine());
  numero3 = Integer.parseInt(s.nextLine());
  
  //comparacion de los dos primeros numeros
  if (numero1 > numero2) {
    aux = numero1;
    numero1 = numero2;
    numero2 = aux; 
   // comparacion de los dos últimos 
  } if (numero2 > numero3) {
    aux = numero2;
    numero2 = numero3;
    numero3 = aux;
   // comparacion de nuevo de los dos primeros números 
  } if (numero1 > numero2) {
    aux = numero1;
    numero1 = numero2;
    numero2 = aux;   
  }   
   System.out.println("Los números están ordenados de menor a mayor: " + numero1 + " " +  numero2 + " " + numero3); 
  }
}


