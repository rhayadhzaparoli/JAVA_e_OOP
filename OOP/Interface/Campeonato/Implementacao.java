package Interface.Campeonato;

public class Implementacao implements Time {
    protected String Campeonato;
    protected String Pais;

    public String identifica_tecnico(String tecnico) {
        return tecnico;
    }
    public int qtd_jogadores(int qtd){
        return qtd;
    }
    public String serie(double serie){
        return serie;
    }
}
