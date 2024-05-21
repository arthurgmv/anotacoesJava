//Métodos estáticos:
/*
    Um método estático, não depende de uma instância da classe para ser utilizado.
    pode-se utilizar conforme:
        NomeDaClasse.metodo();

 */

package atributosEmetodosEstaticos;

public class outroPrograma {
    public static void main(String[] args) {
        Conta c1 = new Conta("Banzé Bento");
        System.out.println("O númrto da conta deste cliente é: "+ c1.getNumero());
        System.out.println("Nome do Cliente: " + c1.getCliente());
        System.out.println("A próxima conta será: " + Conta.proximaConta());
    }
}
