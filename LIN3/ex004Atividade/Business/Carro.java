package LIN3.ex004Atividade.Business;


public class Carro extends Veiculo{

    public int quantidadePortas;

    
    public int getQuantidadePortas;
    


    public Carro(String nome, String fabricante, int ano, int quantidadePortas) {
        super(fabricante, fabricante, ano);
        this.quantidadePortas = quantidadePortas;
    }

    

    @Override
    public void acelerar() {
        if (velocidade < 180) { 
            velocidade += 10;
            System.out.println("\nVelocidade: " + velocidade + " km/h");
        } else {
            System.out.println("Velocidade máxima atingida: " + velocidade + " km/h");
        }
    }

    @Override
    public void desacelerar() {
        if (velocidade > 0) {
            velocidade -= 10;
            System.out.println("Velocidade: " + velocidade + " km/h");
        } else {
            System.out.println("O carro já está parado.");
        }
    }

    @Override
    public void parar() {
        velocidade = 0;
        System.out.println("O veículo parou.");
    }}

