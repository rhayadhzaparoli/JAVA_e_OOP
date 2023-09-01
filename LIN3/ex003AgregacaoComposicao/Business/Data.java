package LIN3.ex003AgregacaoComposicao.Business;

public class Data {
    
    private int dia, mes, ano;

    public Data (int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getData(){
        return String.format("%2d,/%sd/%2d", dia, mes, ano);
       }
}
