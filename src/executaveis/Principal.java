package executaveis;

import encapsulamento.Cliente;
import encapsulamento.Conta;

import java.util.Scanner;

public class Principal {
    static Cliente cliente = new Cliente("Jão Berto", "Rua Sá e Souza");
    static Conta conta = new Conta(1, 200, 300, cliente);
    static Scanner teclado = new Scanner(System.in);

    public static void depositar() {
        System.out.println("====== Depósito ======");
        System.out.println("Informe o valor para o depósito ");
        float valor = teclado.nextFloat();
        if (valor > 0) {
            conta.depositar(valor);
        } else {
            System.out.println("O valor precisa ser positivo");
        }
    }

    public static void sacar() {
        System.out.println("====== Saque ======");
        System.out.println("Informe o valor para sacar");
        float valor = teclado.nextFloat();
        if (valor > 0) {
            conta.saca(valor);
        } else {
            System.out.println("O valor precisa ser positivo");
        }

    }

    public static void saldo(){
        System.out.println("O seu saldo é de: R$" + conta.getSaldo());
    }

    public static void main(String[] args) {
        int opcao = 0;
        System.out.println("Bem-vindo ao sistema bancário!");

        do {
            System.out.println("Selecione uma opção abaixo: ");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Saldo");
            System.out.println("0 - Sair");
            opcao = teclado.nextInt();

            switch (opcao){
                case 1:
                    depositar();
                    break;
                case 2:
                    sacar();
                    break;
                case 3:
                    saldo();
                case 0:
                    break;
                default:
                    System.out.println("Opção Inválida. ");
            }
        } while (opcao > 0);
    }
}