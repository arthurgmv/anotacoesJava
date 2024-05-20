/* faça um programa que receba diversos nomes de
frutas do usuário e no final imprima essas frutas em ordem contrária.
O programa deve solicitar ao usuáiro quantas frutas ele quer informar
*/
import java.util.Scanner;

public class funcoes {
   static String frutas[];
   static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int qtd;

        System.out.println("Informe a quantidade de frutas para cadastrar: ");
        qtd = Integer.parseInt(teclado.nextLine());
        cadastrar_dados(qtd);
        mostrar_dados(qtd);

        teclado.close();
    }
    /* uma função deve ter:
    a) tipo de retorno (tipo de dado que a função vai retornar)
    b) nome (corresponde a ação que a mesma realiza)
    c) parâmetros/argumentos de entrada (opcional)
    d) retorno (opicional - depende do tipo de retorno)
     */

    static void cadastrar_dados(int quantidade){
        frutas = new String[quantidade];

        for(int i = 0; i < quantidade; i++) {
            System.out.println("Informe a " + (i+1) + " fruta: ");
            frutas[i] = teclado.nextLine();
        }
    }
    static void mostrar_dados(int quantidade){
        for (int i = quantidade - 1; i >= 0; i--) {
            System.out.println(frutas[i]);
        }
    }
}
