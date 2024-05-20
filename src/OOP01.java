// +=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=
//Classes:
/*
    O nome das classes inicia com letra maiúscula.
    O nome da classe não deve conter: acentuação, caracteres especiais, espaço.
    Nas classes java, não existe a implementação da função main().
    Toda classe java possui a seguinta forma:
        public class NomeDaClasse{ }
    O nome da classe java DEVE ser o mesmo nome do arquivo java.
 */

//Atributos:
/*
    São as características da classe/molde/modelo de dados.
    Podemos entender atributos como variáveis da classe.
    Uma outra forma de nomeclatura para os atributos são "estados".
    Os atributos são nomeados com letras minúscula
    Sem espaços, sem caracteres especiais, sem espaço.
 */

//Métodos:
/*
    Podemos entender os métodos como a ação que é realizada por um objeto da classe.
    Podemos entender também que os métodos são comportamentos dos objetos da classe.
    Mesmos requisitos das funções:
                a) tipo de retorno (tipo de dado que a função vai retornar)
                b) nome (corresponde a ação que a mesma realiza)
                c) parâmetros/argumentos de entrada (opcional)
                d) retorno (opicional - depende do tipo de retorno)
 */

// +=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=

//classe
public class OOP01 {
    //atributos/estados
    String nome;
    float preco;
    float desconto;

    //Método
    void aumentar_preco(float valor) {
        this.preco = this.preco + valor;
    }
    public OOP01 (){}

    public OOP01(String nome, float preco, float desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    void imprime_informacoes(){
        System.out.println(this.nome);
        System.out.println("R$ " + this.preco);
        System.out.println(this.desconto + "%");
    }

}