package LIN3.ex004AssociacaoComplementar.Business;

public class Carro extends Veiculo {

    public int quantidadedePortas = 4 ;

    public Carro(String nome, String fabricante, int ano, int velocidade) {
        super(nome, fabricante, ano);
        System.out.println(String.format("Quantidade de Portas %d ", quantidadedePortas));
        this.velocidade = velocidade;
    }
    

    

    @Override
    public int acelerar(int velocidade){
        for (velocidade = 10; velocidade <= 180; velocidade += 10){
            System.out.println("\nAcelerando o carro \n" + velocidade);
        }
        return velocidade;
    }

    @Override
    public int desacelerar(int velocidade){
        for (velocidade = getVelocidade(); velocidade >= 10; velocidade -= 10){
            System.out.println("\nDesacelerando o carro \n" + velocidade);
        }
        return velocidade;
    }
}
