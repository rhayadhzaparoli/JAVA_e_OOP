package LIN3.ex001OverrideOverload.Business;

public class Aluno extends Pessoa {
    
    private String ra;

    
    public String getRa() {
        return ra;
    }



    public Aluno (String nome, String email, String ra) {
    super(nome, email);
    this.ra = ra;

    }
}

