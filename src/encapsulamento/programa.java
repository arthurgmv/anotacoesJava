package encapsulamento;
public class programa {
    public static void main(String[] args) {
        Cliente joao = new Cliente("João da Silva", "Rua Sá e Souza, 123");
        Cliente maria = new Cliente("Maria de Souza", "Rua Sá e Souza, 879");

        Conta conta01 = new Conta(1, 100.0f, 500.0f, joao);
        Conta conta02 = new Conta(2, 200.50f, 600.0f, maria);
        System.out.println("-=-=-=-==-=-=-=-=-=-=-=-=-=-=-==-=-=");
        System.out.println("Saldo do João antes do saque: " + conta01.getSaldo());
        System.out.println("Saldo da Maria antes do saque: " + conta02.getSaldo());

        conta01.saca(50);
        conta02.saca(75.50f);
        System.out.println("-=-=-=-==-=-=-=-=-=-=-=-=-=-=-==-=-=");
        System.out.println("Saldo do João depois do saque: " + conta01.getSaldo());
        System.out.println("Saldo da Maria depois do saque: " + conta02.getSaldo());
        System.out.println("-=-=-=-==-=-=-=-=-=-=-=-=-=-=-==-=-=");
    }
}
