package abstracao;

public abstract class Classe_Abstrata {
    
    private String mensagem; // ATRIBUTO


    // GETTER AND SETTERS
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    // METODO PROTECTED
    protected abstract void mostra_mensagem();
}
