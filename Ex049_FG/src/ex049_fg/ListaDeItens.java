package ex049_fg;

/**
 *
 * @author kakah
 */
public class ListaDeItens {
    
    private Item[] itens;
    private int totalDeitens;
    
    public ListaDeItens(int tamanho) {
        this.itens = new Item[tamanho];
        this.totalDeitens = 0;
    }
    
    public void adiciona(Item item) {
        if (item.getPreco() < 0) {
            throw new IllegalArgumentException("O preço do item não pode ser"
                    + " negativado");
        }
        this.itens[this.totalDeitens] = item;
        this.totalDeitens++;
    }
    
    public void  remove(int posicao) {
        if (posicao < 0 || posicao >= this.totalDeitens) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < this.totalDeitens - 1; i++) {
            this.itens[i] = this.itens[i + 1];
        }
        this.totalDeitens--;
    }
    
    public int getTotalDeItens() {
        return this.totalDeitens;
    }

}