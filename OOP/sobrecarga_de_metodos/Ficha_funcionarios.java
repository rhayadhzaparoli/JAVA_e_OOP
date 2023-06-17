package sobrecarga_de_metodos;

public class Ficha_funcionarios  {

    private String nome;
    private int idade;
    private String profissao;
    private double salario;

    Ficha_funcionarios e;

    Ficha_funcionarios(String nome, int idade, String profissao, double salario){

        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
        this.salario = salario; }
    
    Ficha_funcionarios(double salario, String profissao, int idade, String nome) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
        this.salario = salario; 

    }

    Ficha_funcionarios(Ficha_funcionarios e) {
        this.e = e;
        mostra_funcionarios(e);
    }

    public void mostra_funcionarios(Ficha_funcionarios f){
        System.out.println("Nome:" + f.nome + "\n" + "Idade" + f.idade +  "\n" + "Profissao" + f.profissao + "\n" + "Salario" + f.salario );
    }

    public String mostra_funcionario () {
        return ("Nome:" + nome +  "\n" + "Idade" + idade +  "\n" + "Profissao" + profissao + "\n" + "Salario" + salario );
    }    } 

