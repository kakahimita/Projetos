package Xadrez;

import Xadrez.Pecas.Rei;
import Xadrez.Pecas.Torre;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

/**
 *
 * @author kakah
 */
public class PartidaDeXadrez {
    
    private Tabuleiro tabuleiro;

    public PartidaDeXadrez() {
        tabuleiro = new Tabuleiro(8, 8);
        initialSetup();
    }
    
    public XadrezPeca[][] getPecas() {
        XadrezPeca[][] mat = new XadrezPeca[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for (int i=0; i<tabuleiro.getLinhas(); i++) {
            for(int j=0; j<tabuleiro.getColunas(); j++) {
                mat[i][j] = (XadrezPeca) tabuleiro.peca(i, j);
            }
        }
        return mat;
    }
    
    private void initialSetup() {
        tabuleiro.ColocarPeca(new Torre(tabuleiro, Cor.BRANCO), new Posicao(2, 1));
        tabuleiro.ColocarPeca(new Rei(tabuleiro, Cor.PRETO), new Posicao(0, 4));
        tabuleiro.ColocarPeca(new Rei(tabuleiro, Cor.BRANCO), new Posicao(7, 4));
    }
}