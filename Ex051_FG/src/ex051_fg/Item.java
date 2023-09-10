package ex051_fg;

/**
 *
 * @author kakah
 */
public class Item {
    private String nome;
    private int quantidade;

    public Item() {

    }
    
    public Item(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }
    // Métodos especiais

    public String toString() {
        return this.nome + ", " + this.quantidade;
    }

    public boolean equals(Object o) {
        Item outro = (Item) o;
        return this.nome.equals(outro.nome) && this.quantidade == outro.quantidade;
    }

    // Getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}