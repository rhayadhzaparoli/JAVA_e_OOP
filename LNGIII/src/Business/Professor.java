package src.Business;

public class Professor extends Pessoa {
    
    private int matricula;

    

    public int getMatricula() {
        return matricula;
    }



    public Professor(String nome, String email, int matricula) {

        // a filha ja traz o construtor da mae; 
        super("Davi", "davi005@fatecrl.edu.br");
        this.matricula = matricula;

    }

    /*    public Professor(String matricula) {

        // contrutor nao default; chama o super passando as assinaturas 
        // que estão na classe mae; precisa respeitar a assinatura 

        super ("", "");
    }*/


    //override faz a sobrescrita do metodo ja criado.
    @Override //anotation serve para comentar nesse caso.
    public String cumprimentar() {

        return "Ola, sou o professor.";

    // ou poderia ser utilizado assim concatenando:
    // return super.cumprimentar() + "nova mensagem"    
    }

    
    public String cumprimentar(String tratamento) {

        return String.format("ola, meu nome eh %s %s.", tratamento, nome);
    }

    
}
