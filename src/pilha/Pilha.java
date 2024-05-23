package pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
    private List<String> nomes = new LinkedList<String>();

    public void insere(String nome) {
        this.nomes.add(nome);
    }

    public String remove() {
        if (vazia()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        return nomes.remove(nomes.size() - 1);
    }

    public boolean vazia() {
        return nomes.isEmpty();
    }

    @Override
    public String toString() {
        return this.nomes.toString();
    }
}
