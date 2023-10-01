package ex050_fg;

import java.util.Arrays;

/**
 *
 * @author kakah
 */
public class ListaItens {

    private Item[] itens;
    private int tamanho;

    public ListaItens() {
        this.itens = new Item[10];
        this.tamanho = 0;
    }

    public void add(Item item) {
        if (this.tamanho == this.itens.length) {
            this.itens = Arrays.copyOf(this.itens, this.itens.length * 2);
        }

        this.itens[this.tamanho] = item;
        this.tamanho++;
    }

    public Item get(int posicao) {
        if (posicao < 0 || posicao >= this.tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida.");
        }

        return this.itens[posicao];
    }

    public void remove(int posicao) {
        if (posicao < 0 || posicao >= this.tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida.");
        }

        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.itens[i] = this.itens[i + 1];
        }

        this.tamanho--;
    }

    public boolean contains(Item item) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.itens[i].equals(item)) {
                return true;
            }
        }

        return false;
    }

    public int size() {
        return this.tamanho;
    }

    Item[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
