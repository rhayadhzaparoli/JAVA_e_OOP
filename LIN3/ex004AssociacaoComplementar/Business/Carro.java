package LIN3.ex004AssociacaoComplementar.Business;

public class Carro extends Veiculo {


    public Carro(String nome, String fabricante, int ano) {
        super(nome, fabricante, ano);

    }
    
    public int quantidadedePortas ;


    @Override
    public int acelerar(int velocidade){
        for (velocidade = 10; velocidade <= 180; velocidade += 10){
            System.out.println("\nAcelerando o carro \n" + velocidade);
        }
        return velocidade;
    }

    @Override
    public int desacelerar(int velocidade){
        for (velocidade = 180; velocidade >= 10; velocidade -= 10){
            System.out.println("\nDesacelerando o carro \n" + velocidade);
        }
        return velocidade;
    }
}
