package sobrecarga_de_metodos;

public class Acessa_funcionarios extends Ficha_funcionarios {
    static Ficha_funcionarios d = new Ficha_funcionarios("Sueli", 32, "Professora", 3876.00);
    Acessa_funcionarios(){
        super(d);
    }

}
