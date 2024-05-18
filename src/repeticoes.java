import java.util.Scanner;

public class repeticoes {
    public static void main(String[] args) {
        int idade = 1;
        String nome;
        Scanner teclado = new Scanner(System.in);

        while (idade > 0) {
            System.out.println("Informe seu nome: ");
            nome = teclado.nextLine();
            System.out.println("Informe a sua idade: ");
            // idade = teclado.nextInt(); bug
                idade = Integer.parseInt(teclado.nextLine());
            System.out.println(nome + "tem " + idade + " anos.");
        }
        teclado.close();





    }
    /* O Do While faz e depois checa, enquant o while checa antes de executar

    public static void main(String[] args) {
        int idade = 1;
        String nome;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Informe seu nome: ");
            nome = teclado.nextLine();
            System.out.println("Informe a sua idade: ");
            // idade = teclado.nextInt(); bug
            idade = Integer.parseInt(teclado.nextLine());
            System.out.println(nome + "tem " + idade + " anos.");
        } while (idade > 0)

        teclado.close();





    } */
}
