package ex056_fg;

/**
 *
 * @author kakah
 */
public class Item {

    private String nome;
    private double preco;
    private int quantidade; // Adicionamos o atributo 'quantidade'

    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0; // Inicialize a quantidade como 0 por padrão
    }

    // Getters e setters para o campo quantidade

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    

    public String toString() {
        return this.nome + " - R$" + this.preco + " - Quantidade: " + this.quantidade;
    }
}