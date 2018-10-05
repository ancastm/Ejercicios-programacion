import java.util.Scanner;
public class Ejercicio16 {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    
   
    String respuesta;
    int puntos = 0;
    
    System.out.println("Este programa hace un cuestionario para saber si nuestra " +
    "pareja nos está siendo infiel");
    
   
      
      System.out.println("Tu pareja parece estar más inquieta de lo normal");
      respuesta = s.next();   
      if (respuesta.equals("Verdadero")) {       
        puntos +=3;
      }
      
      
      System.out.println("Ha aumentado sus gastos de vestuario");
      respuesta = s.next();
      if (respuesta.equals("Verdadero")) {       
        puntos +=3;
      }
      
     
      System.out.println("Ha perdido el interés que mostraba anteriormente en ti");
      respuesta = s.next();
      if (respuesta.equals("Verdadero")) {       
        puntos +=3;
      }
      
      
      System.out.println("Ahora se afeita y se asea con más frecuencia (si es " +
      "hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es " +
      "mujer)");
      respuesta = s.next();
      if (respuesta.equals("Verdadero")) {       
        puntos +=3;
      }
      
      System.out.println("No te deja que mires la agenda de su teléfono móvil");
       respuesta = s.next();
      if (respuesta.equals("Verdadero")) {       
        puntos +=3;
      }
      
      System.out.println("A veces tiene llamadas que no quiere contestar " +
      "cuando estás tu delante");
      respuesta = s.next();
      if (respuesta.equals("Verdadero")) {       
        puntos +=3;
      }
      
      System.out.println("Últimamente se preocupa más en cuidar la línea y/o" +
      " en estar bronceado/a");
      respuesta = s.next();
      if (respuesta.equals("Verdadero")) {       
        puntos +=3;
      }
      
      System.out.println("Muchos días dice venir tarde de trabajar porque"+ 
      " tiene mucho más trabajo");
      respuesta = s.next();
      if (respuesta.equals("Verdadero")) {       
        puntos +=3;
      }
      
      System.out.println("Has notado que últimamente se perfuma más");
      respuesta = s.next();
      if (respuesta.equals("Verdadero")) {       
        puntos +=3;
      }
      
      System.out.println("Se confunde y dice que ha estado en sitios donde no" +
      " ha ido contigo");
      respuesta = s.next();
      if (respuesta.equals("Verdadero")) {       
        puntos +=3;
      }
      
      if ((puntos >= 0) && (puntos <= 10)) {
        System.out.println("¡Enhorabuena! Tu pareja parece ser totalmente fiel");
      } else if ((puntos >=11) && (puntos <=22)) {
        System.out.println("Quizás exista el peligro de otra persona en su vida" +
        " o en su mente, aunque seguramente sea algo sin importancia. No bajes" +
        " la guardia");
      } else {
        System.out.println("Tu pareja tiene todos los ingredientes para viviendo" +
        " un romance con otra persona. Te aconsejamos que indagues un poco más y" +
        " averigües que es lo que está pasando por su cabeza");
      }       
      
    } 
      
    
}


