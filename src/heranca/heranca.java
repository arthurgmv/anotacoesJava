package heranca;

public class heranca {
    public static void main(String[] args) {
        PessoasEscola p1 = new PessoasEscola("Pedro Tanaka", 2023);
        System.out.println(p1.getNome());

        Aluno a1 = new Aluno("Alice Scaduto", 2020, "123456");
        System.out.println(a1.getNome());
    }
}
