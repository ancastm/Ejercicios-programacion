import java.util.Scanner;
public class Ejercicio12 {
public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        
        double notaPrimerExamen;
        double notaTrimestre;
        double notaFinal;
        
        
        System.out.println("Nota del primer examen: ");
        notaPrimerExamen = s.nextDouble();
        
        System.out.println("Nota deseada del trimestre: ");
        notaFinal = s.nextDouble();
        
        notaTrimestre = ((notaFinal * 100) - (notaPrimerExamen * 40))/60;
        
        System.out.printf("Para sacar un %.2f en el trimestre debes tener un %.2f en el segundo examen",notaFinal,notaTrimestre);
    }
}
