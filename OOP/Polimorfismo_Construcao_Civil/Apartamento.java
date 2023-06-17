package Polimorfismo_Construcao_Civil;

public class Apartamento extends Construcao{

        Construcao apartamento = new Apartamento();
        
        public Apartamento () {
            apartamento.setTipo("APARTAMENTO");
        }
    
        public void controi(){
            System.out.println("FAZ-SE " + apartamento.getTipo());
        }
    }

