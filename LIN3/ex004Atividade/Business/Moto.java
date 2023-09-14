package LIN3.ex004Atividade.Business;

public class Moto extends Veiculo {
    
    boolean descansoAcionado;

    public boolean isDescansoAcionado() {
        return descansoAcionado;
    }



    public Moto(String nome, String fabricante, int ano) {
        super(fabricante, fabricante, ano);
        this.descansoAcionado = true;
    }

    

    @Override
    public void acelerar() {
        if (velocidade < 180) { 
            velocidade += 5;
            descansoAcionado = false;
            System.out.println("\nVelocidade: " + velocidade + " km/h");
        } else {
            System.out.println("Velocidade máxima atingida: " + velocidade + " km/h");
        }
    }

    @Override
    public void desacelerar() {
        if (velocidade > 0) {
            velocidade -= 5;
            System.out.println("Velocidade: " + velocidade + " km/h");
        }
        else {
            System.out.println("A moto já está parado.");
        }
    }
    @Override
    public void parar() {
        velocidade = 0;
        System.out.println("O veículo parou.");
        descansoAcionado = true;
    }

   
    @Override
    public String toString(){
        return super.toString() + "; apoio acionado" + descansoAcionado;
    }

    
    public void acionaPezinho () {
        
    }
}
