package ex048_fg;

/**
 *
 * @author kakah
 */
public class Aluno {
    
    private String nome;
    
    // metodos especiais
    public String toString() {
        return this.nome;
    }
    
    public boolean equals(Object o) {
        Aluno outro = (Aluno)o;
        return this.nome.equals(outro.nome);
    }
    
    // getters e setters
    public String getnome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

}