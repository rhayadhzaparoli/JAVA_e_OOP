package Polimorfismo_Heranca;

public class PessoaJuridica extends Contribuinte{
    
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public void mostraClasse(){
        System.out.println("CLASSE PessoaJuridica");
    }
}
