/*
    Uma interface pode conter:
        Constantes;
        Métodos abstratos;

Interface para servir de contrato apra produtos eletrônicos.
Todo produto eletrônico que implementar esta interface deverá implementar os métodos dela.
 */

package asInterfaces;

public interface IEletronico {
    public String MARCA = "Sony";
    public void ligar();
    public void desligar();
}
