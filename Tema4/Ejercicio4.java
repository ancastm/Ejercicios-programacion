import java.util.Scanner;
public class Ejercicio4 {
  public static void main(String[] args) {
    
   Scanner s = new Scanner(System.in);
    
   int horasOrdinarias = 12;
   int horasExtras = 16;
   int horasTrabajadas;
   
   System.out.println("Por favor, introduzca el número de horas trabajadas durante "
   + " la semana: ");
   horasTrabajadas = Integer.parseInt(s.nextLine());
   
   if (horasTrabajadas <= 40) {
     System.out.println(horasTrabajadas * horasOrdinarias + " euros te corresponden por las horas trabajadas esta semana");
   }else {
     System.out.println(horasTrabajadas * horasExtras + " euros te corresponden por las horas trabajadas esta semana");
   }
  
    
    
    
    
    
    
  }
}

