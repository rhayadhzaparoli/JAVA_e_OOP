package Heranca;

public class Conceito_Heranca {
    

    public static void main (String args[]) {

    Classe_Filha_2 a = new Classe_Filha_2();
    Classe_Filha_3 b = new Classe_Filha_3();

    a.setAtributo_1("Valor do atributo 1");
    a.setAtributo_2("Valor do atributo 2");
    b.setAtributo_3("Valor do atributo 3");
    System.out.println(a.getAtributo_1());
    System.out.println(a.getAtributo_2());
    System.out.println(b.getAtributo_3());
}
}