public class Caballo {
  
//atributos//
private int edad;
private int peso;
private String raza; 
 
 //constructor para crear el objeto, que no siempre serán todos
 //los atributos, los atributos que van aqui dentro pueden ser de otro
 //tipo diferente que los declarados arriba
 Caballo (int e, int p, String r) {
   this.edad = e; //hace referencia a la instancia que está en pruebaCaballo
   this.peso = p;
   this.raza = r;
  }
  
  //getter//
  public String getRaza(){
    return this.raza;
   }
   
   //acciones que hace el caballo//
   public void rumia() {
     System.out.println("Ñam,ñam,ñam");
   }
   public void relincha() {
     System.out.println("Hiiiiiiiiiiii");
    }
    public void cabalga() {
      System.out.println("Toco to toco to toco to");
     }    
    
 
}  

