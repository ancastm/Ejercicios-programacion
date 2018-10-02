import java.util.Scanner;
public class Ejercicio8 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
   int horasTrabajadas;
   int eurosHora = 12;
   
   System.out.println("Introduce el total de horas trabajadas a la semana");
   horasTrabajadas = Integer.parseInt(s.nextLine()); 
   
   int salarioSemanal = horasTrabajadas * eurosHora;
   System.out.println("El salario semanal es: " + salarioSemanal);
      
    
  }
}

    
