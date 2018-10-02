import java.util.Scanner;
public class SentenciaSwitch {
  public static void main(String[] args) {
    Scanner s =new Scanner(System.in);
   String diaIndicado;
   
   System.out.println("Indica el día de la semana, y te digo lo que tienes a 1ª hora:");
   diaIndicado = s.nextLine();
   
   switch (diaIndicado) {
     case  "lunes":
     System.out.println("Hoy toca la asignatura de Sistemas Informáticos");
     break;
     case  "martes":
     System.out.println("Hoy toca la asignatura de Programación");
     break;
     case  "miercoles":
     System.out.println("Hoy toca la asignatura de Sistemas Informáticos");
     break;
     case  "jueves":
     System.out.println("Hoy toca la asignatura de Entornos de Desarrollo");
     break;
     case  "viernes":
     System.out.println("Hoy toca la asignatura de Lenguaje de Marcas");
     break;
     default:
     System.out.println("Hoy no hay clase");
    }
    
  }
}

