package abstracao_serie_C;

public class App  {

    public static void main(String[] args) {
        
        // Instance
        Atributos_e_Metodos abstract_class  = new Acao ();

        // Output's Setter
        abstract_class.setTimes("Sao Paulo" + " x" + " Cruzeiro" + "\n" 
        + " Palmeiras" + " x" + " gremio");

        // Call abstract method
        abstract_class.mostra_times();
    }
    

}