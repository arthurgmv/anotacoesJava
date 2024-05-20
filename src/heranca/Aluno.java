/*
    Benefícios da herança: evita a repetição de código e facilita a manunteção do programa.

    Aluno é uma classe filha/sub-classe
 */
package heranca;

public class Aluno extends PessoasEscola {
    private String ra;

    public Aluno(String nome, int ano_nascimento, String ra){
        super(nome, ano_nascimento);
        this.ra = ra;
    }
    public String getRa(){
        return this.ra = this.ra;
    }
    public void setRa(){
        this.ra = this.ra;
    }


}