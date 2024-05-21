/*
    Atributos estáticos são atributos onde os valores são compartilhados entre as instâncias
    da classe.

 */

package atributosEmetodosEstaticos;

public class programa {
    public static void main(String[] args) {
        Conta c1 = new Conta("Claudio Lumia");
        System.out.println(c1.getNumero());
        System.out.println(c1.getCliente());

        Conta c2 = new Conta("Maria Eduarda");
        System.out.println(c2.getNumero());
        System.out.println(c2.getCliente());

        Conta c3 = new Conta("Clara dos Santos");
        System.out.println(c3.getNumero());
        System.out.println(c3.getCliente());
    }
}
