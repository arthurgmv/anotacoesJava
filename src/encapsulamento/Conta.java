package encapsulamento;

public class Conta {
    int numero;
    private float saldo;
    private float limite;
    Cliente cliente;

    public Conta(int numero, float saldo, float limite, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }

    public void saca(float valor) {
        if (this.saldo >= valor - this.limite) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(float valor) {
        this.saldo += valor;
    }

    public float getSaldo() {
        return this.saldo;
    }
}