package Polimorfismo_Heranca;

public class Funcionario extends PessoaFisica{
    
    private String cartao;

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }
    public void mostraClasse(){
        System.out.println("CLASSE Funcionario");
    }
}
