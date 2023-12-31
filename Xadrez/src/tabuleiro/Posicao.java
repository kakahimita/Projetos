package tabuleiro;

/**
 *
 * @author kakah
 */
public class Posicao {

    private int linha;
    private int coluna;

    //construtor
    public Posicao(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }
    
    //toString para imprimir posição na tela
    @Override
    public String toString() {
        return linha + ", " + coluna;
    }
    
    //getters e setters
    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }
}