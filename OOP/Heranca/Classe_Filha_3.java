package Heranca;

public class Classe_Filha_3 extends Classe_Filha_1 {
    
    private String atributo_3;

    public String getAtributo_3() {
        return atributo_3;
    }

    public void setAtributo_3(String atributo_3) {
        this.atributo_3 = atributo_3;
    }

    Classe_Filha_3(){
    super();
    System.out.println ("Acesso ao metodo construtor da Classe_Filha_3");
}
}