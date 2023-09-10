package ex054_fg;

/**
 *
 * @author kakah
 */
public class Item {
    
    private String nome;
    private double preco; // Adicionamos o atributo 'preco'
    
    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
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
    
    public String toString() {
        return this.nome + " - R$" + this.preco;
    }
}

