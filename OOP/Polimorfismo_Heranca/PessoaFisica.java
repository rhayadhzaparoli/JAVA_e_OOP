package Polimorfismo_Heranca;

public class PessoaFisica extends Contribuinte {
    
    private String rg;

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void mostraClasse(){
        System.out.println("CLASSE PessoaFisica");
    }
}
