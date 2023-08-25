package LIN3.Zex002TR.Business;

abstract class Calculo implements ICalculo {
    
    protected float valor1;
    protected float valor2;
    protected float resultado;

  
    public float getResultado() {
        return resultado;
    }

    public Calculo(float valor1, float valor2){
        super();
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    
}
