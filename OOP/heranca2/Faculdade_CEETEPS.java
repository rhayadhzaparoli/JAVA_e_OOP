package heranca2;

public class Faculdade_CEETEPS extends Centro_Paula_Souza {

    private String faculdade;

    public String getFaculdade() {
        return faculdade;
    }

    public void setFaculdade(String faculdade) {
        this.faculdade = faculdade;
    }

    public Faculdade_CEETEPS() {

        super("Santos"); /* o metodo super() acessa o metodo da classe com hierarquia imediatamente superior na relacao de heranca */
    }
    
}
