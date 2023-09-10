package ex053_fg;

/**
 *
 * @author kakah
 */
public class Item {
    
    private String nome;
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String toString() {
        return this.nome;
    }
    
    public boolean equals(Object o) {
        Item outro = (Item)o;
        return this.nome.equals(outro.nome);
    }

}