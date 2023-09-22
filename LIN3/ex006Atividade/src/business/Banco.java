package business;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Cliente> clientes;
    private ArrayList<Conta> contas;

    public Banco() {
        this.clientes = new ArrayList<Cliente>();
        this.contas = new ArrayList<Conta>();
    }

    public ArrayList<Cliente> getClientes() { return clientes; }

    public ArrayList<Conta> getContas() { return contas; }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void cadastrarConta(Conta conta) {
        contas.add(conta);
    }

    public void vincularContaAoCliente(Cliente cliente, Conta conta) {
        cliente.adicionarConta(conta);
    }
}
