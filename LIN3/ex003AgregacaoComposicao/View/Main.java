package LIN3.ex003AgregacaoComposicao.View;

import LIN3.ex003AgregacaoComposicao.Business.Pessoa;

public class Main {
    
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa ("Fatec", 31, 12, 1986);

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Nascimento: " + pessoa1.getNascimento());
    }
}
