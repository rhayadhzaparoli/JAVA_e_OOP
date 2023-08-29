package LIN3.ex002Interface.Business;

public class Multiplicacao extends Calculo {

    public Multiplicacao(float v1, float v2) {
        super(v1, v2);
    }

    @Override
    public float calcular() {
        return v1 * v2; 
    }
}
