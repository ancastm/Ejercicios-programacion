public class Pizza {
  
  //Atributos//
  private static int pizzaServida = 0;
  private static int pizzaPedida = 0;
  private String tamano;
  private String tipo;
  private String estado;
  
  //Constructor//
   public Pizza (String tamano, String tipo) {
    this.tamano = tamano;
    this.tipo = tipo;
    this.estado = "pedida";
    Pizza.pizzaPedida++;
  }
  
  //Hacemos el toString para mostrar los atributos
  public String toString() {
    return "pizza " + this.tipo + "  " + this.tamano+ ",  " + this.estado;
  }
  
  //Hacemos los getter de las pedidas y servidas
  public static int getpizzaServida() {
    return pizzaServida;
  }
  public static int getpizzaPedida() {
    return pizzaPedida;
  }
  
  //Cambia el estado de la pizza servida a pedida
  public void sirve() {
    if(this.estado.equals("pedida")) {
      this.estado = "servida";
      Pizza.pizzaServida++;
     }else {
       System.out.println("esa pizza ya se ha servido");
     } 
    
    }
  
   
   
   
  
  
  
}
