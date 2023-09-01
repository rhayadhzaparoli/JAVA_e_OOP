package LIN3.ex002InterfaceUpcasting.Business;

public class Subtracao extends Calculo{
    public Subtracao(float v1, float v2) {
        super(v1, v2);
    }

    @Override
    public float calcular() {
        return v1 - v2; 
    }
}
