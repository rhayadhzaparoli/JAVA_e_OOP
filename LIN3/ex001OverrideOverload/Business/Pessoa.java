package LIN3.ex001OverrideOverload.Business;

// se deixar essa classe em private-package abstract, 
// nao será mais vista na View
public class Pessoa {
    
    protected String nome;
    private String email;

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Pessoa (String nome, String email) {

    // o "nome" após o this se refere ao atributo desta instancia 
    // (que esta no private)  e sem o this
    // é o que vem no parametro acima
    this.nome = nome;
    this.email = email;
    
   }

    public String cumprimentar() {

    // %s substitui a variavel string
    return String.format("Olá, meu nome eh %s, email: %s.", nome, email);

   }

}