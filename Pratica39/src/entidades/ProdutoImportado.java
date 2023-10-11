package entidades;

/**
 *
 * @author kakah
 */
public class ProdutoImportado extends Product{

    private Double valorAdicional;

    public ProdutoImportado() {
    }

    public ProdutoImportado(String nome, Double preco, Double valorAdicional) {
        super(nome, preco);
        this.valorAdicional = valorAdicional;
    }
    
    public Double precoTotal() {
        return getPreco() + valorAdicional;
    }
    
    @Override
    public String valorIten() {
        return getNome() + " $" + precoTotal() + " (valor adiconal: $ " + String.format("%.2f", valorAdicional) + ")";
    }
    
    public Double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(Double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
}