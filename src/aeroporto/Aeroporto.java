package aeroporto;

public class Aeroporto {
    String prefixo;
    String nome;
       
    public static void main(String[] args) {
    
        Aviao x = new Aviao();
        x.prefixo = "OUR";
        x.companhia = "OURINHOS";
        x.aterrissar(x);
      
        
        Aviao y = new Aviao();
        y.prefixo = "GUA";
        y.companhia = "GUARULHOS";
        x.aterrissar(y);
       

        x.listar();
        
        
    }
    
}