/*
    Os conjuntos são implementados com a interface Set, e uma das classes que impolementam
    esta interface é a HashSet.

    A maioria das coleções possuem os mesmos métodos já conhecidos e utilizados com as listas,
    mas o comportamentos destes objetos é um pouco diferente. A performance também é melhor
    em conjuntos se comparado às listas.

    Conjuntos não aceitam repecição de valores.

    A ordem de inserção não é respeitada (é feito uma semi-ordenação) e não aceita ordenação.

    Não possui índice.

 */

package conjuntos;


import java.util.HashSet;
import java.util.Set;

public class Conjuntos {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<String>();

        nomes.add("Maria");
        nomes.add("Gabriel");
        nomes.add("Pedro");
        nomes.add("Tiago");
        nomes.add("João");

        System.out.println(nomes.size());

        System.out.println(nomes.contains("João"));

        for (String nome : nomes){
            System.out.println(nome);
        }

    }
}
