public class Ejercicio5 {
  public static void main(String[] args) {
    
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[36m";
    
    System.out.println(morado + "Lunes\tMartes\tMie\tJueves\tViernes");
    System.out.println(naranja + "S.I." + azul + "\tProg" + rojo + "\tS.I." + blanco + "\tProg" + verde +"\tProg");
    System.out.println(azul + "S.I." + morado + "\tProg" + blanco + "\tS.I." + verde + "\tProg" + naranja +"\tProg");
    System.out.println(rojo + "S.I." + blanco + "\tProg" + verde + "\tS.I." + morado + "\tProg" + azul +"\tProg"); 
    System.out.println(verde + "FOL" + rojo + "\tBBDD" + blanco + "\tL.M." + azul + "\tBBDD" + morado + "\tE.D.");
    System.out.println(naranja + "FOL" + blanco + "\tBBDD" + verde + "\tL.M." + morado + "\tBBDD" + blanco + "\tE.D.");
    System.out.println(azul + "FOL" + naranja + "\tBBDD" + morado + "\tL.M." + verde + "\tBBDD" + naranja + "\tE.D.");
     
     
     
     
  }
}

