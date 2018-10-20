/**Escribe un programa que genere la nómina (desglosada) de un empleado según 
 * las siguientes condiciones:
 * 
 * .Se pregunta el cargo del empleado (1- Prog.Junior, 2- Prog.Senior y 3-Jefe
 * de Proyecto), los días que ha estado de viaje visitando clientes durante el mes
 * y su estado civil (1. Soltero, 2. Casado).
 * El sueldo base según el cargo es de 950, 1200 y 1600 segun se trata de Prog
 * Junior, Prog.Senior o Jefe de proyecto, respectivamente.
 * Por cada viaje visitando clientes se le paga 30 € extras. Al sueldo neto hay
 * que restarle el IRPF, que será de un 25% en caso de estar soltero y un 20% en caso 
 * de estar casado. 
 */
 
 import java.util.Scanner;
 
 public class Ejercicio24 {
   public static void main(String[] args) {
     
     Scanner s = new Scanner(System.in);
     
     System.out.println("1- Programador Junior");
     System.out.println("2- Programador Senior");
     System.out.println("3- Jefe de Proyecto");
     System.out.print("Introduzca el cargo del empleado (1-3): ");
     int opcionEmpleado = Integer.parseInt(s.nextLine());
     System.out.print("¿Cuántos días ha estado de viaje?: ");
     int dia = Integer.parseInt(s.nextLine());
     System.out.print("Introduzca su estado civil (1- Soltero, 2- Casado): ");
     String estadoCivil = s.next();
    
     
    String empleado;
    
    
    int sueldoBase = 0; 
    int dietas = dia * 30;
    int sueldoNeto = sueldoBase + dietas;
    double irpf = 0;
            
          switch (opcionEmpleado) {
            case 1: 
              sueldoBase = 950;
            break;
            
            case 2:
              sueldoBase = 1200;
            break;
            
            case 3:
              sueldoBase = 1600;
            break;  
            
            default:
              System.out.println("No es un sueldo correcto");
            

          }   
          switch (irpf) {
            case 1:
              
            
       
        
        
        
        
     
     
     
     
     
     
     
     
   }
 }
  
