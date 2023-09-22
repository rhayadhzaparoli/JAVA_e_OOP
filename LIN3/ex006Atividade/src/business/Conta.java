package business;

public class Conta {
    private int numero;
    private double saldo;

    public int getNumero() { return numero; }
    public double getSaldo() { return saldo; }

    public Conta(int numero) {
        this.numero = numero;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public String toString() {
        return String.format("Numero: %d. Saldo: R$ %.2f", numero, saldo);
    }
}
