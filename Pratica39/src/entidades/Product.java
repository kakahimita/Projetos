package entidades;

/**
 *
 * @author kakah
 */
public abstract class Product {
    
    private String nome;
    private Double preco;

    public Product() {
    }

    public Product(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public abstract String valorIten();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}