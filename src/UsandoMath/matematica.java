/*
Biblioteca que possui vários métodos e constantes estáticas para usarmos em nossos programas.
 */


package UsandoMath;

import java.text.DecimalFormat;

public class matematica {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.round(Math.PI));
        System.out.println(Math.ceil(Math.PI));
        System.out.println(Math.floor(Math.PI));
        System.out.println(Math.sqrt(9));

        double pi = Math.PI;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(pi));


    }
}
