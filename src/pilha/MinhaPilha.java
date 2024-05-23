package pilha;

public class MinhaPilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        System.out.println(pilha);

        pilha.insere("Arthur");
        pilha.insere("Magali");
        System.out.println(pilha);

        String r1 = pilha.remove();
        System.out.println(r1);
        System.out.println(pilha);
    }
}
