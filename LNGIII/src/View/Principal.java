package src.View;

import src.Business.*;

public class Principal {
    
    public static void main(String[] args) {
        
        //instancia classe Pessoa
        Pessoa pessoal = new Pessoa ("Rubens", "lara@fatecrl.edu.br");

        // exibe a mensagem chamando o metodo 
        // cumprimentar e a instancia anterior
        System.out.println(pessoal.cumprimentar());

        Aluno aluno1 = new Aluno("Vitor", "vitor005@fatec.com.br", "A001");
        System.out.println(aluno1.cumprimentar());

        Aluno aluno2 = new Aluno("Fabio", "fabio005@fatec.com.br", "A002");
        System.out.println(aluno2.cumprimentar());

        Professor prof1 = new Professor("Davi", "davi005@fatecrl.edu.br", 000001);
        System.out.println(prof1.cumprimentar());

        // nesse caso o dr.: entra na parte de tratamento declarado 
        // anteriormente. OverLoad aqui.
        Professor prof2 = new Professor("Ivad", "ivad005@fatecrl.edu.br", 100000);
        System.out.println(prof2.cumprimentar("Doutor.: "));
    }
}
