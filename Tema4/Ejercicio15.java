import java.util.Scanner;
public class Ejercicio15 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    String caracterRelleno;
    int opcion;
    
    System.out.println("Este programa pinta una pirámide introduciendo un carácter" + 
     " cualquiera");
    System.out.println("Introduce un carácter que rellenará la pirámide ");
    caracterRelleno = s.nextLine();
    System.out.println("Introduce una opción que pintará la pirámide hacia arriba, abajo, izquierda o derecha");
    System.out.println("1. Hacia arriba");
    System.out.println("2. Hacia abajo");
    System.out.println("3. Hacia la izquierda");
    System.out.println("4. Hacia la derecha");
    opcion = Integer.parseInt(s.nextLine());
    
    
    
    switch (opcion) {
      
      case 1: System.out.println(" "+" " + caracterRelleno);
              System.out.println(" " + caracterRelleno + caracterRelleno + caracterRelleno );
              System.out.println(caracterRelleno + caracterRelleno + caracterRelleno + caracterRelleno + caracterRelleno);
      break;
      
      case 2: 
              System.out.println(caracterRelleno+caracterRelleno+caracterRelleno+caracterRelleno+caracterRelleno);
              System.out.println(" "+caracterRelleno+caracterRelleno+caracterRelleno+" ");
              System.out.println(" "+" "+caracterRelleno+" "+" ");
              
      break;
      
      case 3: System.out.println(caracterRelleno);
              System.out.println(caracterRelleno+caracterRelleno);
              System.out.println(caracterRelleno+" "+caracterRelleno);
              System.out.println(caracterRelleno+caracterRelleno);
              System.out.println(caracterRelleno);
      break;
      
      case 4: System.out.println(" " + " "+caracterRelleno);
              System.out.println(" "+caracterRelleno+caracterRelleno);
              System.out.println(caracterRelleno+" "+caracterRelleno);
              System.out.println(" "+caracterRelleno+caracterRelleno);
              System.out.println(" " + " "+caracterRelleno);
      
      break;
      
      default: 
        System.out.println("Lo siento, la opción elegida no es correcta");
      }
      
   }
}

