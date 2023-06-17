package abstracao;

public class Aplicacao {

    public static void main(String[] args) {

        // INSTANCIA
        Classe_Abstrata abstrata = new Classe_Filha();

        // OUTPUT DO SETTER
        abstrata.setMensagem("Mostrando a Classe_Abstrata");

        //CHAMA METODO ABSTRATO PARA EXECUTAR A ACAO
        abstrata.mostra_mensagem();
    }
    
}
