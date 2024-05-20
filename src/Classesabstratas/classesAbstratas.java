/*
Classes Abstratas:
    É um recurso que proporciona um bloqueio na criação de objetos;
    Como a classe PessoasEscola se tornou abstract não podemos por aqui uma instância
    desta classe, é preciso usarmos os filhos da classe abstratas.
 */

package Classesabstratas;

import heranca.Aluno;
import heranca.PessoasEscola;

public class classesAbstratas {
    public static void main(String[] args) {
        Aluno maria = new Aluno("Maria dos Santos", 2003, "230294");
        System.out.println("A aluna se chama " + maria.getNome());
    }


}
