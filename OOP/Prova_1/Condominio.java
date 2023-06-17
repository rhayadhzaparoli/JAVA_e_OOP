package Prova_1;

public class Condominio {
    
    // atributos
    private String nome_condominio;
    private String endereco_condominio;
    private int quantidade_apartamentos;
    private double valor_condominio;

    // getters n setters
    public String getNome_condominio() {
        return nome_condominio;
    }
    public void setNome_condominio(String nome_condominio) {
        this.nome_condominio = nome_condominio;
    }
    public String getEndereco_condominio() {
        return endereco_condominio;
    }
    public void setEndereco_condominio(String endereco_condominio) {
        this.endereco_condominio = endereco_condominio;
    }
    public int getQuantidade_apartamentos() {
        return quantidade_apartamentos;
    }
    public void setQuantidade_apartamentos(int quantidade_apartamentos) {
        this.quantidade_apartamentos = quantidade_apartamentos;
    }
    public double getValor_condominio() {
        return valor_condominio;
    }
    public void setValor_condominio(double valor_condominio) {
        this.valor_condominio = valor_condominio;
    }

    // construtor 
    Condominio(){}
    Condominio (double valor_condominio) {
        this.valor_condominio = valor_condominio;
    }

}
