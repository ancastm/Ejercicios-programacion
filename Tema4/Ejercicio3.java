import java.util.Scanner;
public class Ejercicio3 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
   int numeroSemana;
   System.out.println("Escribe un número de la semana y te diré el día que corresponde");
   numeroSemana = Integer.parseInt(s.nextLine()); 
   
   if (numeroSemana == 1) {
     System.out.println("Lunes");
   }else if (numeroSemana == 2) {
     System.out.println("Martes");
   }else if (numeroSemana == 3) {
     System.out.println("Miércoles");
   }else if (numeroSemana == 4) {
     System.out.println("Jueves");
   }else if (numeroSemana == 5) {
     System.out.println("Viernes"); 
   }else if (numeroSemana == 6) {
     System.out.println("Sábado");
   }else if (numeroSemana == 7) {
     System.out.println("Domingo");
   }else{
     System.out.println("Ese día no existe");  
                 
    }
    
    
  }
}

