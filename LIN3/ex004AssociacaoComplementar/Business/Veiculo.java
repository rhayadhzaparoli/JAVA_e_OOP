package LIN3.ex004AssociacaoComplementar.Business;

import java.util.Scanner;

public abstract  class Veiculo {
    
    protected String nome;
    protected String fabricante;
    protected int ano;
    protected int velocidade;

    
    
   
    public String getNome() {
        return nome;
    }
    public String getFabricante() {
        return fabricante;
    }
    public int getAno() {
        return ano;
    }
    public int getVelocidade(){
        return velocidade;
    }

    public int acelerar(int velocidade){ 
                for (velocidade = 5; velocidade <= 180; velocidade += 5){
            System.out.println("\nAcelerando o veiculo \n" + velocidade);
        }
        return velocidade;
}

    public int desacelerar(int velocidade){ 

        for ( velocidade = getVelocidade(); velocidade >= 5; velocidade -= 5){
            System.out.println("\nDesacelerando o veiculo \n" + velocidade);
        }
        return velocidade;
}

    public int parar(int velocidade){ 
        if (velocidade == 0){
            System.out.println("\nO veiculo esta parado\n" + velocidade);
        }
        return velocidade;
}

    public Veiculo(String nome, String fabricante, int ano){
        this.nome = nome;
        this.fabricante = fabricante;
        this.ano = ano;
    }
    public int getLimite() {
        return 0;
    }
    
}
