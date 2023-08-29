package LIN3.ex002Interface.Business;

public class Divisao extends Calculo{
    
    public Divisao(float v1, float v2) {
        super(v1, v2);
    }

    @Override
    public float calcular() {
        return v1 / v2; 
    }
}
