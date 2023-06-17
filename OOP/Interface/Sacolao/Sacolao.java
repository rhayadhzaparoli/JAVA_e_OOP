package Interface.Sacolao;
package interface;

public class Sacolao {

    public static void main(String[] args) {
        Implementa_Interface implementacao = new Implementa_Interface();
        implementacao.fruta_vermelha = "maça";
        implementacao.fruta_citrica = "laranja";

        System.out.println("Fruta Citrica : " + implementacao.identifica_fruta(implementacao.fruta_citrica));
        System.out.println("Fruta Vermelha :" + implementacao.identifica_fruta(implementacao.fruta_vermelha));
        System.out.println("Quantidade de frutas : " + implementacao.qts_frutas(12));
        System.out.println("Preco do Kilo : " + implementacao.tecnico("Kemmel Pinto"));
    }
    
}
