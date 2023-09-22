package view;

import business.Banco;
import business.Cliente;
import business.Conta;

public class Principal {
	   public static void main(String[] args) {
	        Banco banco = new Banco();

	        // Cadastrando clientes
	        Cliente cliente1 = new Cliente("Rubens", "12345");
	        Cliente cliente2 = new Cliente("Lara", "54321");

	        // Cadastrando contas
	        Conta conta1 = new Conta(1001);
	        Conta conta2 = new Conta(1002);

	        // Vinculando contas aos clientes
	        banco.cadastrarCliente(cliente1);
	        banco.cadastrarConta(conta1);
	        banco.vincularContaAoCliente(cliente1, conta1);

	        banco.cadastrarCliente(cliente2);
	        banco.cadastrarConta(conta2);
	        banco.vincularContaAoCliente(cliente2, conta2);

	        // Realizando transações
	        conta1.depositar(1000);
	        conta1.sacar(500);

	        conta2.depositar(1500);
	        conta2.sacar(200);

	        // exibe informações
	        System.out.println("Infos Cliente 1: " + cliente1);
	        System.out.println("Infos Cliente 2: " + cliente2);
	        System.out.println("Infos Contas Banco: " + banco.getContas());
	   }
}
