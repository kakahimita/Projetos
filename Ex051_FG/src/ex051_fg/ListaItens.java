package ex051_fg;

import java.util.Arrays;

/**
 *
 * @author kakah
 */
public class ListaItens {
    private Item[] itens = new Item[10];
    private int totalDeItens = 0;

    // Métodos

    public int tamanho() {
        return this.totalDeItens;
    }

    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= this.totalDeItens;
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao < this.itens.length && posicao >= 0;
    }

    public boolean contem(Item item) {
        for (int i = 0; i < this.totalDeItens; i++) {
            if (item.equals(this.itens[i])) {
                return true;
            }
        }
        return false;
    }

    private void garantaEspaco() {
        if (this.totalDeItens == this.itens.length) {
            Item[] novaArray = new Item[this.itens.length * 2];
            for (int i = 0; i < this.itens.length; i++) {
                novaArray[i] = this.itens[i];
            }
            this.itens = novaArray;
        }
    }

    public void adiciona(Item item) {
        this.garantaEspaco();
        this.itens[this.totalDeItens] = item;
        this.totalDeItens++;
    }

    public Item pega(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida pesquisada");
        }
        return this.itens[posicao];
    }

    public void remove(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < this.totalDeItens - 1; i++) {
            this.itens[i] = this.itens[i + 1];
        }
        this.totalDeItens--;
    }

    public void adiciona(int posicao, Item item) {
        this.garantaEspaco();
        if (!this.posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = this.totalDeItens - 1; i >= posicao; i--) {
            this.itens[i + 1] = this.itens[i];
        }
        this.itens[posicao] = item;
        this.totalDeItens++;
    }

    public String toString() {
        return Arrays.toString(itens);
    }

}