package hotel;

public class Departamento_Financeiro extends Hotel_Super {
    
    private String diretor;
    private String gerente;
    private int qtd_funcionarios;

    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    public String getGerente() {
        return gerente;
    }
    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
    public int getQtd_funcionarios() {
        return qtd_funcionarios;
    }
    public void setQtd_funcionarios(int qtd_funcionarios) {
        this.qtd_funcionarios = qtd_funcionarios;
    }

    Departamento_Financeiro() {
        super();
        System.out.println("Acesso ao Departamento Financeiro");
    }
}
