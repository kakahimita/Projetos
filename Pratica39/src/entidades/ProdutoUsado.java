package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author kakah
 */
public class ProdutoUsado extends Product{

    
    private LocalDate dataCompra;

    public ProdutoUsado() {
    }

    public ProdutoUsado(String nome, Double preco, LocalDate dataCompra) {
        super(nome, preco);
        this.dataCompra = dataCompra;
    }
    
    @Override
    public String valorIten() {
        return getNome() + " (usado) $" + String.format("%.2f", getPreco()) + " (data de compra: " + dataCompra.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")";
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }
}