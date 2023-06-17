package Interface.Campeonato;

public class Camp {
    public static void main(String[] args) {
        Implementacao implementacao = new Implementacao();
        implementacao.Campeonato = "Brasileiro";
        implementacao.Pais = "Brasil";

        System.out.println("Campeonato : " + implementacao.Campeonato(implementacao.Campeonato));
        System.out.println("Psis :" + implementacao.Pais(implementacao.Pais));
        System.out.println("Quantidade de jogadores : " + implementacao.qtd_jogadores(11));
        System.out.println("Nome do Tecnico : " + implementacao.preco_kilo(5.56));
    }
}
