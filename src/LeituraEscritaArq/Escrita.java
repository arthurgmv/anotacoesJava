//Escrevendo em arquivos

package LeituraEscritaArq;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Escrita {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner teclado = new Scanner(System.in);
        PrintStream escrever = new PrintStream("saida.txt");

        for (int i = 0; i <5; i++) {

            System.out.println("Escreva algo: ");
            String msg = teclado.nextLine();

            escrever.println(msg);
        }

        escrever.close();
        teclado.close();
    }
}
