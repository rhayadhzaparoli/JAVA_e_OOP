package business;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private ArrayList<Conta> contas;

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public ArrayList<Conta> getContas() { return contas; }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.contas = new ArrayList<Conta>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    @Override
    public String toString() {
        return String.format("Nome: %s - CPF: %s - Contas: %s", nome, cpf, contas);
    }
}
