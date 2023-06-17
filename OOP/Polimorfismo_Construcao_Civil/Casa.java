package Polimorfismo_Construcao_Civil;

public class Casa extends Construcao {

    Construcao casa = new Casa();
    
    public Casa () {
        casa.setTipo("CASA");
    }

    public void controi(){
        System.out.println("FAZ-SE" + casa.getTipo());
    }
}
