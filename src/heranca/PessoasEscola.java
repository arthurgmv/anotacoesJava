/*
    Classe base;
    Classe mãe;
    Classe pai;
    Super classe;
    Classe genérica;
 */

package heranca;

public abstract class PessoasEscola {
    private String nome;
    private int ano_nascimento;

    public PessoasEscola (String nome, int ano_nascimento){
        this.nome = nome;
        this.ano_nascimento = ano_nascimento;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getAno_nascimento(){
        return this.ano_nascimento = ano_nascimento;
    }

    public void setAno_nascimento(){
        this.ano_nascimento = ano_nascimento;
    }

}
