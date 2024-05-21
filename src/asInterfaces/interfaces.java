/*
    Interfaces - O que é e quando utilizar:

    Ex prático: Uma empresa criou um contrato com "regras" para definir a criação de um produto/serviço,
    o João decidiu criar um produto/serviço baseado neste contrato, enquanto que a maria
    também decidiu criar implementar um produto/serviço baseado no mesmo contrato.

 */


package asInterfaces;

public class interfaces {
    public static void main(String[] args) {
        System.out.println("A marca do ventilador é: " + ventilador.MARCA);
        ventilador vent = new ventilador();
        vent.desligar();
        vent.ligar();
        vent.desligar();
    }
}
