public class Ejercicio1 {
  public static void main (String[] args) {
   
   int numero1;
   int numero2;
   int resultado;
   
   String linea;
  
   System.out.println("Introduzca el primer número: ");
   linea = System.console().readLine();
   numero1 = Integer.parseInt(linea);
   
   System.out.println("Introduzca el segundo número: ");
   linea = System.console().readLine();
   numero2 = Integer.parseInt(linea);
   
   resultado = numero1 * numero2;
   
   System.out.println("El resultado es: " + resultado); 
    
  }
}

