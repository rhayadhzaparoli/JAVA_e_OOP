package Heranca4_Organiza_Cidade;

public class Bairro_de_Santos extends Regiao_de_Santos {
    
    Bairro_de_Santos(){
        super("b");
    }

    private String rua;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}
