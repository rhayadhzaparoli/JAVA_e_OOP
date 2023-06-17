package Interface.Sacolao;

public class Implementa_Interface implements Classe_Interface {

    protected String fruta_vermelha;
    protected String fruta_citrica;

    public String identifica_fruta(String fruta) {
        return fruta;
    }
    public int qts_frutas(int qtd){
        return qtd;
    }
    public double preco_kilo(double preco){
        return preco;
    }
    
}
