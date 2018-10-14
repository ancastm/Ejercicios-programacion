import java.util.Scanner;
 
 public class Ejercicio21 {
   public static void main(String[] args) {
     
    Scanner s = new Scanner(System.in);
    
    boolean saltaBucle = true;
    int numeroIntroducido = 0;
    int contadorNumero = 0;
    int cuentaImpares = 0;
    int sumaImpares = 0;
    int mayorPar = 0;
    
    while (saltaBucle) {
      System.out.println("Introduce un número");
      numeroIntroducido = Integer.parseInt(s.nextLine());
      
      if (numeroIntroducido <=0) {
            
        //numero negativo
        saltaBucle = false;
      }else{
        // logica del numero positivo.
        contadorNumero++;
        //numeros impares
        if ((numeroIntroducido %2) ==1) {
          sumaImpares += numeroIntroducido;
          cuentaImpares++;
        }else {
        //numeros pares
            if (numeroIntroducido > mayorPar) {
            mayorPar = numeroIntroducido;
            } 
        }  
      } 
     
    }//aqui acaba el bucle
    
     System.out.println("Ha introducido " + contadorNumero + " números positivos");
     System.out.println("La media de los números impares es : " + (sumaImpares / cuentaImpares));
     System.out.println("El mayor de los pares es: " + mayorPar);
  }
}
