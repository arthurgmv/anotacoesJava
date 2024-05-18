public class ternario {
    public static void main(String[] args) {
        int valor = 3, num;
        /*
        if (valor > 0) {
            num = valor;
        } else {
            num = 7;
        } */

        num = (valor > 0 ) ? valor : 7;

        System.out.println(num);
    }
}
