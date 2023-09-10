package ex056_fg;

/**
 *
 * @author kakah
 */
import java.util.Arrays;

public class ListaItems {

    private Item[] items = new Item[10];
    private int totalDeItems = 0;
    
    private void ordenarPorQuantidade() {
    Arrays.sort(this.items, 0, this.totalDeItems, (item1, item2) -> Integer.compare(item2.getQuantidade(), item1.getQuantidade()));
}


    public int tamanho() {
        return this.totalDeItems;
    }

    boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= this.totalDeItems;
    }

    boolean posicaoOcupada(int posicao) {
        return posicao < this.items.length && posicao >= 0;
    }

    public boolean contem(String nomeItem) {
        for (int i = 0; i < this.totalDeItems; i++) {
            if (nomeItem.equals(this.items[i].getNome())) {
                return true;
            }
        }
        return false;
    }

    private void garantaEspaco() {
        if (this.totalDeItems == this.items.length) {
            Item[] novaArray = new Item[this.items.length * 2];
            for (int i = 0; i < this.items.length; i++) {
                novaArray[i] = this.items[i];
            }
            this.items = novaArray;
        }
    }

    public void adiciona(String nomeItem, double precoItem, int quantidade) {
        int indiceExistente = encontraIndicePorNome(nomeItem);

        if (indiceExistente != -1) {
            // Item já existe na lista, apenas atualize a quantidade
            Item itemExistente = this.items[indiceExistente];
            itemExistente.setQuantidade(itemExistente.getQuantidade() + quantidade);
        } else {
            // Item não existe, adicione como novo item
            Item item = new Item(nomeItem, precoItem);
            item.setQuantidade(quantidade);
            this.garantaEspaco();
            this.items[this.totalDeItems] = item;
            this.totalDeItems++;
        }
    }


    public void remove(String nomeItem, int quantidade) {
        for (int i = 0; i < this.totalDeItems; i++) {
            if (nomeItem.equals(this.items[i].getNome())) {
                Item item = this.items[i];
                if (item.getQuantidade() <= quantidade) {
                    // Remova o item se a quantidade a ser removida for maior ou igual à quantidade atual
                    for (int j = i; j < this.totalDeItems - 1; j++) {
                        this.items[j] = this.items[j + 1];
                    }
                    this.items[this.totalDeItems - 1] = null;
                    this.totalDeItems--;
                } else {
                    // Apenas diminua a quantidade se for menor
                    item.setQuantidade(item.getQuantidade() - quantidade);
                }
                break;
            }
        }
    }

    public String exibirLista() {
        ordenarPorQuantidade(); // Chame o método para ordenar por quantidade
        StringBuilder lista = new StringBuilder();
        for (int i = 0; i < this.totalDeItems; i++) {
            lista.append(this.items[i].toString()).append("\n");
        }
        return lista.toString();
    }
    
    public int encontraIndicePorNome(String nomeItem) {
    for (int i = 0; i < this.totalDeItems; i++) {
        if (nomeItem.equals(this.items[i].getNome())) {
            return i;
        }
    }
    return -1; // Retorna -1 se o item não for encontrado
}



    public String toString() {
        return exibirLista();
    }
}
