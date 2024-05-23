/*
Listas:
    aceitam repetições de valores;
    possuem tamanho infinito (a depender da memória);
    aceitam valores de tipos diferentes;

 */

package listas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MinhaLista {
    public static void main(String[] args) {
        ArrayList nomes = new ArrayList();
        nomes.add("Maria");
        nomes.add("Ana");
        nomes.add("João");
        nomes.add("Tiago");
        nomes.add("Banzé");

        /*
        nomes.add(44);
        nomes.add(true);
        nomes.add(12.4);
        nomes.add('e');
        System.out.println(nomes.get(0));
        System.out.println(nomes.get(3));
        */

        Collections.sort(nomes); //ordem alfabética

        for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }
    }
}
