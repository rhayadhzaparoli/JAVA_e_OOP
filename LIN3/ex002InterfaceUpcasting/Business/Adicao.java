package LIN3.ex002InterfaceUpcasting.Business;

public class Adicao extends Calculo {
    
    public Adicao(float v1, float v2) {
        super(v1, v2);
    }

    @Override
    public float calcular() {
        return v1 + v2; 
    }
}