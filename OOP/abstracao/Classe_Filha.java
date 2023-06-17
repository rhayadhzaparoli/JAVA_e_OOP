package abstracao;

public class Classe_Filha extends Classe_Abstrata {
    
    // CRIA A ACAO DO METODO PROTECTED
    protected void mostra_mensagem(){
        System.out.println("Mensagem: \t" + getMensagem());
    }
}
