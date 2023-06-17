package Heranca4_Organiza_Cidade;

public class Cidade_de_Santos {
 
    private String regiao;
    private Integer populacao;

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public Integer getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Integer populacao) {
        this.populacao = populacao;
    }

    Cidade_de_Santos( String s) {

        if (s == "r")
        System.out.println("Secretaria de Regionais");
        if ( s == "b")
        System.out.println("Secretaria de Bairros");
    }

}
