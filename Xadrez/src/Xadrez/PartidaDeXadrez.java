package Xadrez;

import tabuleiro.Tabuleiro;

/**
 *
 * @author kakah
 */
public class PartidaDeXadrez {
    
    private Tabuleiro tabuleiro;

    public PartidaDeXadrez() {
        tabuleiro = new Tabuleiro(8, 8);
    }
    
    public XadrezPeca[][] getPecas() {
        XadrezPeca[][] mat = new XadrezPeca[tabuleiro.getLinha()][tabuleiro.getColuna()];
        for (int i=0; i<tabuleiro.getLinha(); i++) {
            for(int j=0; j<tabuleiro.getColuna(); j++) {
                mat[i][j] = (XadrezPeca) tabuleiro.peca(i, j);
            }
        }
        return mat;
    }
}