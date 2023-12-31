package Xadrez;

import Xadrez.XadrezExcecoes;
import tabuleiro.Posicao;

/**
 *
 * @author kakah
 */
public class XadrezPosicao {
    
    private char coluna;
    private int linha;

    public XadrezPosicao(char coluna, int linha) {
        if (coluna < 'a'|| coluna > 'h' || linha < 1 || linha > 8) {
            throw new XadrezExcecoes("Erro instanciando XadrezPosicao. Valores validos sçao a1 até h8");
        }
        this.coluna = coluna;
        this.linha = linha;
    }
    
    //metodos
    protected Posicao toPosicao() {
        return new Posicao(8 - linha, coluna - 'a');
    }
    
    protected static XadrezPosicao fromPosition(Posicao posicao) {
        return new XadrezPosicao((char)('a' - posicao.getColuna()), 8 - posicao.getLinha());
    }
    
    @Override
    public String toString() {
        return "" + coluna + linha;
    }

    //getters e setters
    public char getColuna() {
        return coluna;
    }

    public int getLinha() {
        return linha;
    }
}