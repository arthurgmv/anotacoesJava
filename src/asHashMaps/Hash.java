/*
    A classe HashMap implementa a interface map e trabalha com o conceito de chave/valor;

 */

package asHashMaps;

import encapsulamento.Cliente;
import encapsulamento.Conta;

import java.util.HashMap;
import java.util.Map;

public class Hash {
    public static void main(String[] args) {
        Map<String, Conta> Contas = new HashMap<String, Conta>();
        Cliente cli1 = new Cliente("Dannyel", "Rua Sá e Souza");
        Cliente cli2 = new  Cliente ("Kayke", "Rua José Hipólito Cardoso");

        Conta c1 = new Conta(1, 200, 300, cli1);
        Conta c2 = new Conta(2, 500, 700, cli2);

        Contas.put("Pessoa Física", c1);
        Contas.put("Pessoa Jurídica", c2);

        System.out.println(Contas.get("Pessoa Física"));
        System.out.println(Contas.get("Pessoa Jurídica"));
        System.out.println(Contas.size());
        System.out.println(cli1.nome);
        System.out.println(cli2.nome);
    }
}
