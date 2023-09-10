package ex054_fg;

/**
 *
 * @author kakah
 */
import java.util.Arrays;

public class ListaItems {

    private Item[] items = new Item[10];
    private int totalDeItems = 0;

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

    public void adiciona(String nomeItem, double precoItem) {
        Item item = new Item(nomeItem, precoItem);
        this.garantaEspaco();
        this.items[this.totalDeItems] = item;
        this.totalDeItems++;
    }

    public Item pega(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posicao inválida pesquisada");
        }
        return this.items[posicao];
    }

    public void remove(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posicao inválida");
        }
        for (int i = posicao; i < this.totalDeItems - 1; i++) {
            this.items[i] = this.items[i + 1];
        }
        this.items[this.totalDeItems - 1] = null;
        this.totalDeItems--;
    }

    public void adiciona(int posicao, Item item) {
        this.garantaEspaco();
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posicao inválida");
        }
        for (int i = this.totalDeItems - 1; i >= posicao; i--) {
            this.items[i + 1] = this.items[i];
        }
        this.items[posicao] = item;
        this.totalDeItems++;
    }

    public String exibirLista() {
        StringBuilder lista = new StringBuilder();
        for (int i = 0; i < this.totalDeItems; i++) {
            lista.append(this.items[i].toString()).append("\n");
        }
        return lista.toString();
    }

    public String toString() {
        return exibirLista();
    }
}
