package abstracao;

public class Condominio extends Conceito {

    
    // COMO A CLASSE MAE É ABSTRATA PRECISA TRAZER O GETTER PARA ACESSO

    protected String getNome_Condominio() {

        return "Vila Nova";

    }


    // ACAO DO METODO ABSTRATO 
    protected double calcula_condominio(double a) {

        return a*1.066;

    }


    // NOVO METODO
    public void endereco_condominio() {

        System.out.println("Rua Kemmel Soares, nº 22");

    }
    
}
