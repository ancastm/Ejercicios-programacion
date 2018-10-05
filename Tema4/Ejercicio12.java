import java. util.Scanner;
/**Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
 *que se imparten en el curso. Cada pregunta acertada sumará un punto. El
 *programa mostrará al final la calificación obtenida. Pásale el minicuestionario
 *a tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
 *en las diferentes asignaturas del curso.
 *
 * @author Anabel Castejón
 */
public class Ejercicio12 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int puntos = 0;
    String respuesta;
    
    System.out.println("1. ¿Cual es el comando de Linux que sirve para listar?");
    System.out.println(" a) ls\n b) gunzip\n c) cut");
    respuesta = s.nextLine();
    if(respuesta.equals("a")) {
      puntos++;
    }
    System.out.println("2. ¿Qué es refactorizar?");
    System.out.println(" a) Hacer un código limpio\n b) Poner comentarios en el"
      + " programa\n c) No tocar el código bajo ningún concepto");
    respuesta = s.nextLine();
    if(respuesta.equals("a")) {
      puntos++;
    }
    System.out.println("3. ¿Quién fue Patty McHugh?");
    System.out.println(" a) Quién creó el primer ordenador personal\n b) Quien"
      + " creó la placa base\n c) Quien créo el concepto de programación");
    respuesta = s.nextLine();
    if(respuesta.equals("b")) {
      puntos++;
    }
    System.out.println("4. ¿Qué es el logo de Java?");
    System.out.println(" a) Una manzana\n b) Una taza de café\n c) Un teclado");
    respuesta = s.nextLine();
    if(respuesta.equals("b")) {
      puntos++;
    }
    System.out.println("5. ¿Cuantos espacios se deben dejar para la sangría "
      + " según el estándar de google para la codificación en Java?");
    System.out.println(" a) 1\n b) 2\n c) 3");
    respuesta = s.nextLine();
    if(respuesta.equals("b")) {
      puntos++;
    }
    System.out.println("6. ¿Cuando se creó el primer sistema operativo?");
    System.out.println(" a)1956\n b)1970\n c)1983");
    respuesta = s.nextLine();
    if(respuesta.equals("a")) {
      puntos++;
    }
    System.out.println("7. ¿Qué lenguajes se utilizan en BBDD?");
    System.out.println(" a) My Querie\n b)SQL Server\n c) Javascript");
    respuesta = s.nextLine();
    if(respuesta.equals("b")) {
      puntos++;
    }
    System.out.println("8. ¿Qué tipos de lenguajes de programación existen?");
    System.out.println(" a) PhP\n b)Phytonic\n c) Geany");
    respuesta = s.nextLine();
    if(respuesta.equals("a")) {
      puntos++;
    }
    System.out.println("9. ¿Quién fundó Linux?");
    System.out.println(" a) Mike Lin\n b)Linus Torvalds\n c) Lin Tomas");
    respuesta = s.nextLine();
    if(respuesta.equals("b")) {
      puntos++;
    }
    System.out.println("10. ¿Cuando una página web sirve tanto para pcs, "
      + " smarthphones o tablets?");
    System.out.println(" a) Diseñada\n b)Responsive\n c)Constructiva");
    respuesta = s.nextLine();
    if(respuesta.equals("b")) {
      puntos++;
    }
    System.out.println("El test ha finalizado, has obtenido " + puntos + " puntos");
  }
}
