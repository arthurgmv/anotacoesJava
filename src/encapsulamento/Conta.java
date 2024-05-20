package encapsulamento;
/*
    Getters & Setters:
    - Getter:
       Um método público que serve para consultar dados.
       A nomenclatura desses métodos é get_nome_do_produto
 */
public class Conta {
    int numero;
    private float saldo;
    private float limite;
    Cliente cliente;

    public Conta(int numero, float saldo, float limite, Cliente Cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }
    void saca(float valor) {
        if (valor < this.saldo + this.limite) {
            this.saldo = (this.saldo + this.limite) - valor;
        } else {
            System.out.println("Saldo insulficiente.");
        }
    }

    void depositar(float valor){
        this.saldo = this.saldo + valor;
    }

    public float getSaldo (){
        return this.saldo + this.limite;
    }
}
