package datas;

import java.time.LocalDate;
import java.time.Month;

public class Datas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje); // (YYYY/MM/DD)

        LocalDate ano_novo = LocalDate.of(2025, Month.JANUARY, 1);
        System.out.println(ano_novo);

        int ano = ano_novo.getYear();
        Month mes = ano_novo.getMonth();
        int dia = ano_novo.getDayOfMonth();

        System.out.println(ano);
        System.out.println(mes);
        System.out.println(dia);
    }
}
