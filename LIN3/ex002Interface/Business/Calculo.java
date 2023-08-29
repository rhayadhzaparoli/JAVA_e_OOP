package LIN3.ex002Interface.Business;

abstract class Calculo implements ICalculo {
    
    protected float v1;
    protected float v2;
    public float resultado;

  
    public float getResultado() {
        return resultado;
    }

    public Calculo(float v1, float v2){
        super();
        this.v1 = v1;
        this.v2 = v2;
    }

    
}
