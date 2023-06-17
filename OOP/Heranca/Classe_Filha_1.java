package Heranca;

public class Classe_Filha_1 extends SuperClasse {
    
    private String atributo_2;
    private String atributo_3;

    public String getAtributo_3() {
        return atributo_3;
    }

    public void setAtributo_3(String atributo_3) {
        this.atributo_3 = atributo_3;
    }

    public String getAtributo_2() {
        return atributo_2;
    }

    public void setAtributo_2(String atributo_2) {
        this.atributo_2 = atributo_2;
    }

    Classe_Filha_1(){
    super();
    System.out.println ("Acesso ao metodo construtor da Classe_Filha_1");

    }}