public class PruebaCaballo {
  public static void main(String []args) {
    
    /*Prueba Caballo.java
     * Programa que prueba la clase Caballo
     * @author Anabel Castejón Martínez
     */
     
     Caballo a = new Caballo(5, 22, "Percherón");
     Caballo b = new Caballo(7, 25, "Purasangre");
     
     System.out.println("Hola, yo soy un  " + a.getRaza());
     a.relincha();
     a.rumia();
     
     System.out.println("Buenas, pues yo soy un " + b.getRaza());
     b.cabalga();
     b.relincha();
     
    
    
  }
  
 }

