//Default Methods
/*
    Implementada a partir da versão 8 do Java (em 2024 estamos na versão 10);
 */
package defaultM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultM {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();

        Comparator<String> comparator = new Comparador();

        palavras.add("Java");
        palavras.add("TypeScript");
        palavras.add("Ruby");
        palavras.add("Python");

        Collections.sort(palavras, comparator);
        System.out.println(palavras);


    }
}
