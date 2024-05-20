// +=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=
// Objetos:
/*
    Objetos são os produtos/isntâncias da classe.
 */

//Cosntrutor:
/*
    O construtor de uma classe sempre tem o mesmo nome da classe.
    Por padrão a JVM (Java Virtual Machine), criar em tempo de execução um cosntrutor padrão, um
    construtor vazio.
    Podemos de ter mais de um construtor na classe.

 */
// +=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=
public class oop02 {
    public static void main(String[] args) {
        OOP01 produto1 = new OOP01(); //construtor
        produto1.nome = "caneta";
        produto1.preco = 5.5f;
        produto1.desconto = 5.0f;

        System.out.println("======produto1======");
        produto1.imprime_informacoes();

        OOP01 produto2 = new OOP01("caderno", 10.0f, 2.5f);
        System.out.println("======produto2======");
        produto2.imprime_informacoes();
    }
}

