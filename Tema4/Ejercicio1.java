import java.util.Scanner;
public class Ejercicio1 {
  public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
    
   String dia;
   System.out.println("Introduce un día de la semana y te diré qué asignatura toca: ");
   dia = s.next(); 
    
    if (dia.equals("lunes")) {
      System.out.println("Hoy toca la asignatura de Sistemas Informáticos");
      }else if (dia.equals("martes")) {
        System.out.println("Hoy toca la asignatura de Programación");
      }else if (dia.equals("miercoles")) {
        System.out.println("Hoy toca la asignatura de Sistemas Informáticos");
      }else if (dia.equals("jueves")) {
        System.out.println("Hoy toca la asignatura de Entornos de Desarrollo");
      }else if (dia.equals("viernes")) {
        System.out.println("Hoy toca la asignatura de Lenguaje de Marcas");
    }else{
      System.out.println("Hoy no hay clase");
    }            
    
    
  }
}

