package ejercicio1aleatorio;
/**
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * tambiÃ©n la suma total (los puntos que suman entre los tres dados).
 *
 * @author Anabel CastejÃ³n MartÃ­nez
 */
public class Ejercicio1Aleatorio {

  public static void main(String[] args) {

    int tirada;
    int suma = 0;
    
    System.out.println("Este programa muestra la tirada de 3 dados");
     
    for (int i = 0; i < 3; i++) {
      tirada = (int) (Math.random() * 6) +1;
      System.out.print(tirada + " ");
      suma+=tirada;
    }
    System.out.println("La suma es: " + suma);
  }

}

